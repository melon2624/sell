package com.zx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zx.model.ProductCategory;

import java.util.List;

public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {

    public  List<ProductCategory> selectBytypeIdlist(List<Integer> typeIdList);
}