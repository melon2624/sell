package com.zx.service.impl;

import com.zx.dao.OrderMasterMapper;
import com.zx.model.OrderMaster;
import com.zx.service.OrderMasterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderMasterServiceImplTest {

    @Autowired
    OrderMasterMapper masterMapper;
    @Autowired
    OrderMasterService orderMasterService;
    @Test
    void findByOpenId() {

    }

    @Test
    void  saveTest(){
        OrderMaster orderMaster=new OrderMaster();
        orderMaster.setBuyerOpenid("123");
        orderMaster.setBuyerAddress("梅林关");
        orderMaster.setBuyerName("zhangxin");
        orderMaster.setBuyerPhone("15575881223");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        orderMaster.setOrderId("2");
        orderMasterService.save(orderMaster);
    }
}