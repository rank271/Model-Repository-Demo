package com.example.modelrepositorydemo.repository;

import com.example.modelrepositorydemo.Entity.Artifact;
import com.example.modelrepositorydemo.Entity.Release;

/**
 * @className: ReleaseRepository
 * @author: admin
 * @Version: 1.0
 * @description:
 */

public interface ArtifactRepository {
    boolean save(Artifact artifact);

    boolean update(Artifact artifact);

    Artifact findOne(Long artifactld);

    Artifact findByGroupNameAndName(String groupName, String name);

    Artifact findByGroupld(Long groupUd);
}
