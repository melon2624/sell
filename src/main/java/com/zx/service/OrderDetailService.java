package com.zx.service;

import com.zx.model.OrderDetail;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface OrderDetailService extends IService<OrderDetail>{

    List<OrderDetail> findByOrderId(String orderId);


}
