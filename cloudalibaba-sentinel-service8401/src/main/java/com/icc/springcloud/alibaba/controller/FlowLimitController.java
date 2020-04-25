package com.icc.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author K
 * @Date 2020/4/22 22:45
 * @Version 1.0
 */
@RestController
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        return "****testA";
    }
    @GetMapping("/testB")
    public String testB() {
        return "****testB";
    }
}
