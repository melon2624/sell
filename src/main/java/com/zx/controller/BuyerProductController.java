package com.zx.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.zx.VO.ProductInfoVO;
import com.zx.VO.ProductVO;
import com.zx.VO.ResultVO;
import com.zx.model.ProductCategory;
import com.zx.model.ProductInfo;
import com.zx.service.ProductCategoryService;
import com.zx.service.ProductInfoService;
import com.zx.util.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    ProductInfoService productService;

    @Autowired
    ProductCategoryService categoryService;

    @GetMapping("/list")
    public ResultVO List() {
        //1. 查询所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //查询类目(一次性查询)
       //List<Integer> categoryTypeList = new ArrayList<>();
       /*
        //传统方法
        for (ProductInfo productInfo : productInfoList) {
       categoryTypeList.add(productInfo.getCategoryType());
        }*/
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        //3. 数据拼装
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory: productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo: productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);

    }
}
