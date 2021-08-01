package com.zx.service;

import com.lly835.bestpay.model.PayResponse;
import com.zx.dto.OrderDTO;

/**
 * @author zhangxin
 * @date 2021/8/1 21:29
 */
public interface PayService {

    public PayResponse create(OrderDTO orderDTO);



}
