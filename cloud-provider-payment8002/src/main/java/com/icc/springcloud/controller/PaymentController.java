package com.icc.springcloud.controller;


import com.icc.springcloud.entities.CommonResult;
import com.icc.springcloud.entities.Payment;
import com.icc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author K
 * @Date 2020/4/16 19:40
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    public String serverPort;

    @PostMapping("/add")
    public CommonResult add(@RequestBody Payment payment) {
        int result = paymentService.add(payment);
        log.info("插入结果" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort-->"+serverPort,result);
        } else {
            return new CommonResult(201, "插入数据库失败",null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult get(@PathVariable Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果" + payment);
        if (payment !=null) {
            return new CommonResult(200, "查询数据库成功,serverPort-->"+serverPort,payment);
        } else {
            return new CommonResult(201, "查询数据库失败",null);
        }
    }

    @GetMapping("/lb")
    public String getPaymentLB() {
        return serverPort;
    }
}
