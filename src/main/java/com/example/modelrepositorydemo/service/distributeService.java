package com.example.modelrepositorydemo.service;

import com.example.modelrepositorydemo.Entity.DistributeLock;
import com.example.modelrepositorydemo.repository.DistributeLockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className: distributeService
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Service
public class distributeService {
    @Autowired
    private DistributeLockRepository distributeLockRepository;

    public DistributeLock getLock(String businessCode) {
        return distributeLockRepository.getLock(businessCode);
    }
}
