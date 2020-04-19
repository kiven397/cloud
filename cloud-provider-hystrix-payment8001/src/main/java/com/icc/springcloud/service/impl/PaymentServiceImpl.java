package com.icc.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.icc.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author K
 * @Date 2020/4/18 19:55
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池:  " + Thread.currentThread().getName() + " paymentInfo_OK,id:  " + id;
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "4000")
    })
    @Override
    public String paymentInfo_TimeOut(Integer id) {
         try { TimeUnit.SECONDS.sleep(3); } catch (Exception e) { e.printStackTrace(); }
        return "线程池:  " + Thread.currentThread().getName() + " paymentInfo_TimeOut,id:  " + id;
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池:  " + Thread.currentThread().getName() + " paymentInfo_TimeOutHandler,id:  " + id;

    }

    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    @Override
    public String paymentCircuitBreaker(Integer id) {
        if (id < 0) {
            throw new RuntimeException("*********id 不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功,流水号:" + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(Integer id) {
        return "id不能为负数，请稍后再试";
    }


}
