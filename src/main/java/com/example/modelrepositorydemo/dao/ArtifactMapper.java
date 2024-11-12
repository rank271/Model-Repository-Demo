package com.example.modelrepositorydemo.dao;

import com.example.modelrepositorydemo.Entity.Artifact;
import org.apache.ibatis.annotations.Mapper;

/**
 * @interfaceName: ArtifactMapper
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Mapper
public interface ArtifactMapper {

    Artifact findByGroupNameAndName(String groupName, String name);
}
