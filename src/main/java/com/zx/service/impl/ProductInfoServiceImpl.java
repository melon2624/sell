package com.zx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zx.model.ProductInfo;
import com.zx.dao.ProductInfoMapper;
import com.zx.service.ProductInfoService;

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
}
