package com.zx.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.service.OrderMasterService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zx.model.OrderMaster;
import com.zx.dao.OrderMasterMapper;

@Service
public class OrderMasterServiceImpl extends ServiceImpl<OrderMasterMapper, OrderMaster> implements OrderMasterService {

    @Override
    public IPage<OrderMaster> findByOpenId(String openId, Page page) {
        return null;
    }
}
