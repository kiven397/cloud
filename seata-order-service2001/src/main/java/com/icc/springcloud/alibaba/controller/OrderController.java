package com.icc.springcloud.alibaba.controller;

import com.icc.springcloud.alibaba.domain.CommonResult;
import com.icc.springcloud.alibaba.domain.Order;
import com.icc.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author K
 * @Date 2020/4/23 19:07
 * @Version 1.0
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
