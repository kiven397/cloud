package com.icc.springcloud.alibaba.service;

import com.icc.springcloud.alibaba.entities.CommonResult;
import com.icc.springcloud.alibaba.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author K
 * @Date 2020/4/23 13:49
 * @Version 1.0
 */
@Component
public class PaymentFallBackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回");
    }
}
