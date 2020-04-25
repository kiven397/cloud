package com.icc.springcloud.alibaba.service.impl;

import com.icc.springcloud.alibaba.dao.OrderDao;
import com.icc.springcloud.alibaba.domain.Order;
import com.icc.springcloud.alibaba.service.AccountService;
import com.icc.springcloud.alibaba.service.OrderService;
import com.icc.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author K
 * @Date 2020/4/23 18:45
 * @Version 1.0
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    public void create(Order order) {
        log.info("创建订单");
        orderDao.create(order);
        log.info("减少库存");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("减余额");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("修改订单状态");
        orderDao.update(order.getUserId(), 0);
    }
}
