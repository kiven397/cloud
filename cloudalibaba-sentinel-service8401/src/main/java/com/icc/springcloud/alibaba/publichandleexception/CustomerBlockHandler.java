package com.icc.springcloud.alibaba.publichandleexception;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Component;

/**
 * @Author K
 * @Date 2020/4/23 11:05
 * @Version 1.0
 */
@Component
public class CustomerBlockHandler {

    public static String handle(BlockException exception) {
        return "自定义返回";
    }

}
