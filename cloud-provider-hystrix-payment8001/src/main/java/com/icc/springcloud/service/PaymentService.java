package com.icc.springcloud.service;

/**
 * @Author K
 * @Date 2020/4/18 19:55
 * @Version 1.0
 */
public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String paymentInfo_TimeOut(Integer id);
    public String paymentCircuitBreaker(Integer id);
}
