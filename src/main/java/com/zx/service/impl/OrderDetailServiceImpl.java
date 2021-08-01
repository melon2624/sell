package com.zx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zx.model.OrderDetail;
import com.zx.dao.OrderDetailMapper;
import com.zx.service.OrderDetailService;
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService{


    @Autowired
    OrderDetailMapper orderDetailMapper;

    @Override
    public List<OrderDetail> findByOrderId(String orderId) {
        QueryWrapper<OrderDetail> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("order_id",orderId);

        List<OrderDetail> orderDetailList=orderDetailMapper.selectList(queryWrapper);
        return orderDetailList;
    }
}
