package com.example.modelrepositorydemo.repository;

import com.example.modelrepositorydemo.Entity.Artifact;
import com.example.modelrepositorydemo.dao.ArtifactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @className: ArtifactRepositoryImpl
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Repository
public class ArtifactRepositoryImpl implements ArtifactRepository {

    @Autowired
    private ArtifactMapper artifactMapper;

    @Override
    public boolean save(Artifact artifact) {
        return false;
    }

    @Override
    public boolean update(Artifact artifact) {
        return false;
    }

    @Override
    public Artifact findOne(Long artifactld) {
        return null;
    }

    /**
     * 通过部门名和仓库名获取仓库
     */
    @Override
    public Artifact findByGroupNameAndName(String groupName, String name) {
        Artifact findArtifact = artifactMapper.findByGroupNameAndName(groupName, name);
        return findArtifact;
    }

    @Override
    public Artifact findByGroupld(Long groupUd) {
        return null;
    }
}
