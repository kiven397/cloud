package com.icc.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author K
 * @Date 2020/4/21 20:00
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3399
{
    public static void main(String[] args) {
         SpringApplication.run(NacosConfigClientMain3399.class, args);
    }
}