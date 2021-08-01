package com.zx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.dto.CartDto;
import com.zx.enums.ResultEnum;
import com.zx.exception.SellException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zx.model.ProductInfo;
import com.zx.dao.ProductInfoMapper;
import com.zx.service.ProductInfoService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoMapper, ProductInfo> implements ProductInfoService{

    @Autowired
    ProductInfoMapper mapper;

    @Override
    public ProductInfo findOne(String productId) {
        QueryWrapper<ProductInfo> queryWrapper=new QueryWrapper<>();

        queryWrapper.eq("product_id",productId);

        return mapper.selectOne(queryWrapper);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        QueryWrapper<ProductInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("product_status",0);
        List<ProductInfo> list = mapper.selectList(wrapper);
        return list;
    }

    @Override
    public IPage<ProductInfo> findAll(Page<ProductInfo> page) {
        QueryWrapper<ProductInfo> wrapper = new QueryWrapper<>();

        IPage<ProductInfo> productInfoPage = mapper.selectPage(page,wrapper);
        return productInfoPage;
    }

    @Override
    public ProductInfo save1(ProductInfo productInfo) {
        return null;
    }

    @Override
    @Transactional
    public void increaseStock(List<CartDto> cartDtoList) {
        for (CartDto cartDto:cartDtoList){
            ProductInfo productInfo=mapper.selectById(cartDto.getProductId());
            if (productInfo==null){
                throw  new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            Integer result=productInfo.getProductStock()+cartDto.getProductQuantity();
            productInfo.setProductStock(result);
            mapper.updateById(productInfo);
        }

    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDto> cartDtoList) {
        for (CartDto cartDto:cartDtoList){
            ProductInfo productInfo=mapper.selectById(cartDto.getProductId());
            if (productInfo==null){
                throw  new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            Integer result= productInfo.getProductStock()-cartDto.getProductQuantity();
                if (result<0){
                    throw  new  SellException(ResultEnum.PRODUCT_STOCK_ERROR);
                }

                productInfo.setProductStock(result);
               mapper.updateById(productInfo);
            }
    }
}
