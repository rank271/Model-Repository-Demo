package com.example.modelrepositorydemo.Entity;

import lombok.Data;

import java.util.Date;

/**
 * @className: Log
 * @author: admin
 * @Version: 1.0
 * @description:日志
 */
@Data
public class Log {
    /**
     * 日志id
     */
    private String logId;
    /**
     * 操作人
     */
    private String creator;
    /**
     * 操作
     */
    private String operation;
    /**
     * 发布版本id
     */
    private Long releaseId;
    /**
     * 发布版本号
     */
    private String releaseNo;
    /**
     * 版本id
     */
    private Long versionId;
    /**
     * 仓库id
     */
    private Long artifactId;
    /**
     * 模型UUID
     */
    private String modelUUID;
    /**
     * 日志时间
     */
    private Date gmtCreat;

    public Log(String logId, String creator, String operation, Long releaseId, String releaseNo, Long versionId, Long artifactId, String modelUUID, Date gmtCreat) {
        this.logId = logId;
        this.creator = creator;
        this.operation = operation;
        this.releaseId = releaseId;
        this.releaseNo = releaseNo;
        this.versionId = versionId;
        this.artifactId = artifactId;
        this.modelUUID = modelUUID;
        this.gmtCreat = gmtCreat;
    }
}
