package com.example.modelrepositorydemo.repository;

import com.example.modelrepositorydemo.Entity.Release;
import com.example.modelrepositorydemo.dao.ReleaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @className: ReleaseRepositoryImpl
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Repository
public class ReleaseRepositoryImpl implements ReleaseRepository {
    @Autowired
    private ReleaseMapper releaseMapper;

    @Override
    public boolean save(Release release) {
        return false;
    }
    /**
     * 打标记有问题的版本
     */
    @Override
    public boolean updateRollBack(Long releaseId, boolean rollback) {
        return releaseMapper.updateRollBack(releaseId, rollback);
    }

    @Override
    public Release findOne(Long releaseId) {
        return null;
    }
    /**
     * 通过仓库id和发布版本号找发布版本
     */
    @Override
    public Release findByArtifactIdAndReleaseNo(Long artifactId, String releaseNo) {
        return releaseMapper.findByArtifactIdAndReleaseNo(artifactId, releaseNo);
    }
}
