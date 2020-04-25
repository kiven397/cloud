package com.icc.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author K
 * @Date 2020/4/23 20:12
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class storage {
    private Long id;
    private Long productId;
    private Integer total;
    private Integer used;
    private Integer residue;
}
