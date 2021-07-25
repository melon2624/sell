package com.zx;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zx.dao.ProductCategoryMapper;
import com.zx.model.ProductCategory;
import com.zx.service.ProductCategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SellApplicationTests {

    @Autowired
    ProductCategoryService productCategoryServicel;

    @Autowired
    ProductCategoryMapper mapper;

    @Test
    void contextLoads() {
        ProductCategory productCategory=new ProductCategory();

        productCategory.setCategoryName("早餐");
        productCategory.setCategoryType(1);

        mapper.insert(productCategory);
     ProductCategory productCategory1=   mapper.selectById(1);

      //  System.out.printf(productCategory1.toString());
        QueryWrapper<ProductCategory> wrapper=new QueryWrapper<>();

        List<ProductCategory> list= mapper.selectList(wrapper);



    }

}
