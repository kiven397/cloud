package com.icc.springcloud.alibaba.dao;

import com.icc.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author K
 * @Date 2020/4/23 18:24
 * @Version 1.0
 */
@Mapper
public interface OrderDao {

    //1 新建订单
    void create(Order order);

    //2 修改订单状态 status =  0 ->  1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
