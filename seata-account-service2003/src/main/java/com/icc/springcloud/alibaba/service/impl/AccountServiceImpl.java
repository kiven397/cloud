package com.icc.springcloud.alibaba.service.impl;

import com.icc.springcloud.alibaba.dao.AccountDao;
import com.icc.springcloud.alibaba.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author K
 * @Date 2020/4/23 20:50
 * @Version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;
    @Override
    public void decrease(Long userId, BigDecimal money) {
        accountDao.decrease(userId, money);
    }
}
