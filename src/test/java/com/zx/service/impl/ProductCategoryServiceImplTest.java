package com.zx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zx.model.ProductCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductCategoryServiceImplTest {
    @Autowired
    private  ProductCategoryServiceImpl service;

    @Test
    void getOne() {
      ProductCategory productCategory= service.getOne(1);
        System.out.printf(productCategory.toString());
    }

    @Test
    void findAll() {

        List<ProductCategory> list= service.findAll();
    }

    @Test
    void findByCategoryTypeIn() {
    }

    @Test
    void save1() {
    }
}