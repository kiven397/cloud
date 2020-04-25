package com.icc.springcloud.alibaba.service;

import com.icc.springcloud.alibaba.entities.CommonResult;
import com.icc.springcloud.alibaba.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author K
 * @Date 2020/4/23 13:45
 * @Version 1.0
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallBackService.class)
@Component
public interface PaymentService {
    @GetMapping("/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
