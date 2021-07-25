package com.zx.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.model.OrderMaster;
import com.baomidou.mybatisplus.extension.service.IService;
public interface OrderMasterService extends IService<OrderMaster>{


    IPage<OrderMaster> findByOpenId(String openId, Page page);

}
