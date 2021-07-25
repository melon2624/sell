package com.zx.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.dto.OrderDTO;
import com.zx.service.OrderDetailService;
import com.zx.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDetailService orderDetailService;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {



        return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Page page) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(Page page) {
        return null;
    }
}
