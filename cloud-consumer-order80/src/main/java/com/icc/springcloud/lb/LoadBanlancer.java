package com.icc.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author K
 * @Date 2020/4/17 22:20
 * @Version 1.0
 */
public interface LoadBanlancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
