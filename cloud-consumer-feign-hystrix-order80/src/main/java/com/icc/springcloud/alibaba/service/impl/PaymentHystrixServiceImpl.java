package com.icc.springcloud.alibaba.service.impl;

import com.icc.springcloud.alibaba.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @Author K
 * @Date 2020/4/19 13:15
 * @Version 1.0
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "发生了错误 Ok方法进行了降级";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "发生了错误 timeout方法进行了降级";
    }
}
