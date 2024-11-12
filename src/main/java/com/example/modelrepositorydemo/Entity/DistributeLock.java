package com.example.modelrepositorydemo.Entity;

import lombok.Data;

/**
 * @className: DistributeLock
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Data
public class DistributeLock {
    /**
     * 锁id
     */
    private Integer id;
    /**
     * 锁code
     */
    private String businessCode;
    /**
     * 锁名
     */
    private String businessName;
}
