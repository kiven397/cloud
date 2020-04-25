package com.icc.springcloud.alibaba.service.impl;

import com.icc.springcloud.alibaba.dao.PaymentDao;
import com.icc.springcloud.alibaba.entities.Payment;
import com.icc.springcloud.alibaba.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author K
 * @Date 2020/4/16 19:38
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int add(Payment payment) {
        return paymentDao.add(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}
