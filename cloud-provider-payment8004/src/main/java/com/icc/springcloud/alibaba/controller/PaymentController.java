package com.icc.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author K
 * @Date 2020/4/17 16:48
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/zk")
    public String paymentzk() {
        return "springCloud with zookeeper-->" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
