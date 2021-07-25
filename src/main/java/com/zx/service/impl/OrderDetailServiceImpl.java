package com.zx.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zx.model.OrderDetail;
import com.zx.dao.OrderDetailMapper;
import com.zx.service.OrderDetailService;
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService{

    @Override
    public List<OrderDetail> findByOrderId(String orderId) {
        return null;
    }
}
