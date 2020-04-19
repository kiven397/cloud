package com.icc.springcloud.controller;

import com.icc.springcloud.entities.CommonResult;
import com.icc.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author K
 * @Date 2020/4/18 14:20
 * @Version 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("consumer/payment/get/{id}")
    public CommonResult get(@PathVariable Long id) {
       return paymentFeignService.get(id);
    }

}
