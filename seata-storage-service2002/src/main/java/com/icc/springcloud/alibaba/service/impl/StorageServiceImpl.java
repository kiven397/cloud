package com.icc.springcloud.alibaba.service.impl;

import com.icc.springcloud.alibaba.dao.StorageDao;
import com.icc.springcloud.alibaba.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author K
 * @Date 2020/4/23 20:30
 * @Version 1.0
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;
    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId, count);
    }
}
