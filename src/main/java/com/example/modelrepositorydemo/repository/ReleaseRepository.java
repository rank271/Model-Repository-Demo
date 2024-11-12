package com.example.modelrepositorydemo.repository;

import com.example.modelrepositorydemo.Entity.Release;

/**
 * @className: ReleaseRepository
 * @author: admin
 * @Version: 1.0
 * @description:
 */

public interface ReleaseRepository {
    boolean save(Release release);
    boolean updateRollBack(Long releaseId, boolean rollback);
    Release findOne(Long releaseId);

    Release findByArtifactIdAndReleaseNo(Long artifactId, String releaseNo);
}
