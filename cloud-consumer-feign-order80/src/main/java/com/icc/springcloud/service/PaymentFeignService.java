package com.icc.springcloud.service;

import com.icc.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author K
 * @Date 2020/4/18 14:04
 * @Version 1.0
 */
@Component
@FeignClient(value = "cloud-payment-service")
public interface PaymentFeignService {
    @GetMapping("/payment/get/{id}")
    CommonResult get(@PathVariable("id") Long id);
}
