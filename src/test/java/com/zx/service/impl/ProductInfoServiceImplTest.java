package com.zx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.dao.ProductInfoMapper;
import com.zx.model.ProductInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductInfoServiceImplTest {

    @Autowired
    ProductInfoMapper mapper;


    @Test
    void findOne() {
        QueryWrapper<ProductInfo> queryWrapper=new QueryWrapper<>();

        queryWrapper.eq("product_id",1);

        ProductInfo productInfo= mapper.selectOne(queryWrapper);
    }

    @Test
    void findUpAll() {
        QueryWrapper<ProductInfo> wrapper = new QueryWrapper<>();
        //wrapper.eq("product_status",0);
        List<ProductInfo> list = mapper.selectList(wrapper);
    }

    @Test
    void findAll() {
        Page<ProductInfo> page = new Page<>(1, 2);
        QueryWrapper<ProductInfo> wrapper = new QueryWrapper<>();

        IPage<ProductInfo> productInfoPage = mapper.selectPage(page,wrapper);

    }

    @Test
    void save1() {
    }
}