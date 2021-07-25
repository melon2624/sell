package com.zx.service;

import com.zx.model.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ProductCategoryService extends IService<ProductCategory> {

        public  ProductCategory getOne(Integer categoryId);

        public List<ProductCategory> findAll();

        List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryIdList);

      public   ProductCategory save1(ProductCategory productCategory);


}


