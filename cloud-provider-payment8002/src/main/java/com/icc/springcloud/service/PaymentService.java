package com.icc.springcloud.service;

import com.icc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author K
 * @Date 2020/4/16 19:37
 * @Version 1.0
 */
public interface PaymentService {
    public int add(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
