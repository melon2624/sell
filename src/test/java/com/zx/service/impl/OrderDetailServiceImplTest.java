package com.zx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zx.dao.OrderDetailMapper;
import com.zx.model.OrderDetail;
import com.zx.service.OrderDetailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderDetailServiceImplTest {

    @Autowired
    OrderDetailService orderDetailService;

    @Autowired
    OrderDetailMapper orderDetailMapper;

    @Test
    void findByOrderId() {
   /*     OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("3");
        orderDetail.setOrderId("2");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductId("4");
        orderDetail.setProductName("卤粉");
        orderDetail.setProductPrice(new BigDecimal(2.2));
        orderDetail.setProductQuantity(3);
            orderDetailService.save(orderDetail);*/
        QueryWrapper<OrderDetail> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("order_id",2);
     OrderDetail orderDetail=   orderDetailMapper.selectOne(queryWrapper);

    }
}