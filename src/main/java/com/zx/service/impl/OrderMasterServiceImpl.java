package com.zx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.model.ProductInfo;
import com.zx.service.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zx.model.OrderMaster;
import com.zx.dao.OrderMasterMapper;

@Service
public class OrderMasterServiceImpl extends ServiceImpl<OrderMasterMapper, OrderMaster> implements OrderMasterService {

    @Autowired
    OrderMasterMapper orderMasterMapper;

    @Override
    public IPage<OrderMaster> findByOpenId(String openId, Page page) {

        QueryWrapper<OrderMaster> wrapper = new QueryWrapper<>();
        wrapper.eq("buyer_openid",openId);

        IPage<OrderMaster> orderMasterPage = orderMasterMapper.selectPage(page,wrapper);

      //  Page<OrderMaster>

        return orderMasterPage;
    }
}
