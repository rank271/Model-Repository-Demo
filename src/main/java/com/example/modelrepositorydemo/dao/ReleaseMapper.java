package com.example.modelrepositorydemo.dao;

import com.example.modelrepositorydemo.Entity.Release;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

/**
 * @className: ReleaseMapper
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Mapper
public interface ReleaseMapper {

    List<Release> getAllRelease();

    Release findByArtifactIdAndReleaseNo(Long artifactId, String releaseNo);

    boolean updateRollBack(Long releaseId, boolean rollback);
}
