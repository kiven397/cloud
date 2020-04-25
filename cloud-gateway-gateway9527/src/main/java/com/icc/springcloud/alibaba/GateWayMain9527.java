package com.icc.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author K
 * @Date 2020/4/19 21:02
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.icc"})
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class, args);
    }
}
