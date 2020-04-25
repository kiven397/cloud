package com.icc.springcloud.alibaba.service;

/**
 * @Author K
 * @Date 2020/4/23 20:28
 * @Version 1.0
 */
public interface StorageService {
    void decrease(Long productId, Integer count);

}
