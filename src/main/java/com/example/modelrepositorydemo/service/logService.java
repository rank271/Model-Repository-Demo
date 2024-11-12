package com.example.modelrepositorydemo.service;

import com.example.modelrepositorydemo.Entity.*;
import com.example.modelrepositorydemo.dao.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className: userService
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Service
public class logService {
    @Autowired
    private LogMapper logMapper;
    /**
     * 保存日志
     */
    public void save(Artifact findArtifact, Release findRelease, Operation operation, User user) {
        Log log = new Log(null, user.getUserId(), operation.toString(), findRelease.getReleaseId(), findRelease.getReleaseNo(), findRelease.getVersionId(), findRelease.getArtifactId(), findRelease.getModelUUID(), null);
        logMapper.save(log);
    }
}
