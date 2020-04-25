package com.icc.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.icc.springcloud.alibaba.entities.CommonResult;
import com.icc.springcloud.alibaba.entities.Payment;
import com.icc.springcloud.alibaba.publichandleexception.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author K
 * @Date 2020/4/23 10:16
 * @Version 1.0
 */
@RestController
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommonResult byResource() {
        return new CommonResult(200, "按资源名称限流ok", new Payment(2020L, "serial001"));
    }

    public  CommonResult handleException(BlockException exception) {
        return new CommonResult(444, exception.getClass().getCanonicalName() + "\t服务不可用",null);
    }

    public  CommonResult handle(BlockException exception) {
        return new CommonResult(555, exception.getClass().getCanonicalName() + "\t服务不可用",null);
    }

    @GetMapping("/zdy")
    @SentinelResource(value = "zdy", blockHandler = "handle",blockHandlerClass = CustomerBlockHandler.class)
    public String zdy() {
        return "成功";
    }


}
