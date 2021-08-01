package com.zx.service.impl;

import com.zx.dto.OrderDTO;
import com.zx.service.PayService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhangxin
 * @date 2021/8/1 21:38
 */
@SpringBootTest
class PayServiceImplTest {
    private  final  String ORDER_ID="1627740613662355055";
    @Autowired
    OrderServiceImpl orderService;

    @Autowired
    PayService payService;

    @Test
    void create() {
       // OrderDTO orderDTO=new OrderDTO();
        OrderDTO orderDTO=   orderService.findOne(ORDER_ID);
        payService.create(orderDTO);

    }
}