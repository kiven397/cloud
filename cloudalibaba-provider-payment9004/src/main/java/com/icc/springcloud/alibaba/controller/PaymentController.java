package com.icc.springcloud.alibaba.controller;

import com.icc.springcloud.alibaba.entities.CommonResult;
import com.icc.springcloud.alibaba.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author K
 * @Date 2020/4/23 12:25
 * @Version 1.0
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();
    static {
        hashMap.put(1L, new Payment(1L, "18a8c4454545458wb5sds5sad0"));
        hashMap.put(2L, new Payment(2L, "28a8c4454545458wb5sds5sad0"));
        hashMap.put(3L, new Payment(3L, "38a8c4454545458wb5sds5sad0"));
    }

    @GetMapping("/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult<>(200, "from sql,serverPort:" + serverPort, payment);
        return result;
    }
}
