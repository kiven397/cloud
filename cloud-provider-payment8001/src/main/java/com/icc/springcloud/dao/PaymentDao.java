package com.icc.springcloud.dao;

import com.icc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author K
 * @Date 2020/4/16 19:21
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {
    public int add(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
