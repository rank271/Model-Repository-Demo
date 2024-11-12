package com.example.modelrepositorydemo.repository;

import com.example.modelrepositorydemo.Entity.DistributeLock;
import com.example.modelrepositorydemo.dao.DistributeLockMapper;
import com.example.modelrepositorydemo.exception.DistributeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @className: DistributeLockImpl
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Repository
public class DistributeLockRepositoryImpl implements DistributeLockRepository {
    @Autowired
    private DistributeLockMapper distributeLockMapper;
    /**
     * 获取分布式锁
     */
    public DistributeLock getLock(String businessCode) {
        DistributeLock distributeLock = distributeLockMapper.selectDistributeLock(businessCode);
        if (distributeLock == null) {
            throw new DistributeNotFoundException();
        }
        return distributeLock;
    }
}
