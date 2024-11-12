package com.example.modelrepositorydemo.service;

import com.example.modelrepositorydemo.Entity.*;
import com.example.modelrepositorydemo.repository.ArtifactRepositoryImpl;
import com.example.modelrepositorydemo.repository.ReleaseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @className: rollBackService
 * @author: admin
 * @Version: 1.0
 * @description:为目标版本标记为无效
 */
@Service
public class rollBackService {
    @Autowired
    private ArtifactRepositoryImpl artifactRepository;
    @Autowired
    private ReleaseRepositoryImpl releaseRepository;
    @Autowired
    private userService userService;
    @Autowired
    private logService logService;
    @Autowired
    private distributeService distributeService;
    @Autowired
    private TransactionTemplate transactionTemplate;

    public boolean rollBack(Group group, Artifact artifact, Release release) {
        // 查询目标仓库
        Artifact findArtifact = artifactRepository.findByGroupNameAndName(group.getGroupName(), artifact.getName());
        if (findArtifact == null) {
            return false;
        }
        // 查询目标版本
        Release findRelease = releaseRepository.findByArtifactIdAndReleaseNo(findArtifact.getArtifactId(), release.getReleaseNo());
        if (findRelease == null) {
            return false;
        }
        // 获取操作人
        User user = userService.getUser();
        // 设置事务传播级别为REQUIRED
        transactionTemplate.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        // 开始事务，执行成功返回True
        Boolean execute = transactionTemplate.execute(new TransactionCallback<Boolean>() {
            @Override
            public Boolean doInTransaction(TransactionStatus status) {
                try {
                    // 获取分布式锁
                    distributeService.getLock("rollback");
                    // 标记目标版本为无效
                    releaseRepository.updateRollBack(findRelease.getReleaseId(), true);
                    // 记录目标版本、操作人、操作动作
                    logService.save(findArtifact, findRelease, Operation.DELETE, user);
                    return true;
                } catch (Exception e) {
                    // 事务回滚
                    status.setRollbackOnly();
                }
                return false;
            }
        });
        return execute;
    }
}
