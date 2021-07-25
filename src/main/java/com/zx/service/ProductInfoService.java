package com.zx.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.model.ProductInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ProductInfoService extends IService<ProductInfo>{

     ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();

    IPage<ProductInfo> findAll(Page<ProductInfo> page );

    ProductInfo save1(ProductInfo productInfo);

}
