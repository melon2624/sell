package com.zx.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zx.model.ProductCategory;
import com.zx.dao.ProductCategoryMapper;
import com.zx.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {

    @Autowired
    ProductCategoryMapper mapper;

    @Override
    public ProductCategory getOne(Integer categoryId) {
        QueryWrapper<ProductCategory> queryWrapper=new QueryWrapper<>();

        queryWrapper.eq("category_id",categoryId);

        return mapper.selectOne(queryWrapper);
    }

    @Override
    public List<ProductCategory> findAll() {

        QueryWrapper<ProductCategory> wrapper = new QueryWrapper<>();

        List<ProductCategory> list = mapper.selectList(wrapper);

        return list;
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryIdList) {


        return  mapper.selectBytypeIdlist(categoryIdList);
    }

    @Override
    public ProductCategory save1(ProductCategory productCategory) {
        return null;
    }
}


