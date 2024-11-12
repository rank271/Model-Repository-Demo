package com.example.modelrepositorydemo.repository;

import com.example.modelrepositorydemo.Entity.Artifact;
import com.example.modelrepositorydemo.Entity.DistributeLock;

/**
 * @className: ReleaseRepository
 * @author: admin
 * @Version: 1.0
 * @description:
 */

public interface DistributeLockRepository {
    DistributeLock getLock(String businessCode);
}
