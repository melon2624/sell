package com.zx.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.dto.OrderDTO;
import com.zx.model.OrderDetail;
import com.zx.model.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class OrderServiceImplTest {

    @Autowired
    OrderServiceImpl orderService;

    private final  String BUYER_OPENID="10000";

    private  final  String ORDER_ID="1627740613662355055";

    @Test
    void create() {
        OrderDTO orderDTO=new OrderDTO();
        orderDTO.setBuyerName("zhangxin");
        orderDTO.setBuyerAddress("梅林关");
        orderDTO.setBuyerPhone("15575881223");
        orderDTO.setBuyerOpenid(BUYER_OPENID);

        //购物车
        List<OrderDetail>  orderDetailList=new ArrayList<>();
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setProductId("3");
        orderDetail.setProductQuantity(2);
        orderDetailList.add(orderDetail);
        OrderDetail orderDetail1=new OrderDetail();
        orderDetail1.setProductId("2");
        orderDetail1.setProductQuantity(3);
        orderDetailList.add(orderDetail1);
        orderDTO.setOrderDetailList(orderDetailList);
        orderService.create(orderDTO);
        log.info("创建订单");
    }

    @Test
    void findOne() {
     OrderDTO orderDTO=   orderService.findOne(ORDER_ID);

    }

    @Test
    void findList() {
        Page<ProductInfo> page = new Page<>(1, 5);
    Page<OrderDTO> orderDTOPage=    orderService.findList("10000",page);
    }

    @Test
    void cancel() {
        OrderDTO orderDTO=orderService.findOne(ORDER_ID);
        orderService.cancel(orderDTO);
    }

    @Test
    void finish() {
        OrderDTO orderDTO=orderService.findOne(ORDER_ID);
        orderService.finish(orderDTO);
    }

    @Test
    void paid() {
        OrderDTO orderDTO=orderService.findOne(ORDER_ID);
        orderService.paid(orderDTO);
    }

    @Test
    void testFindList() {
    }
}