package com.icc.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author K
 * @Date 2020/4/23 19:18
 * @Version 1.0
 */
@Configuration
@MapperScan({"com.icc.springcloud.alibaba.dao"})
public class MyBatisConfig {

}
