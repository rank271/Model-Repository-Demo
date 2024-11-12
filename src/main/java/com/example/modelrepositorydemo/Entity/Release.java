package com.example.modelrepositorydemo.Entity;

import com.example.modelrepositorydemo.exception.ValidationException;
import lombok.Data;

import java.util.Date;

/**
 * @className: Release
 * @author: admin
 * @Version: 1.0
 * @description:版本
 */
@Data
public class Release {
    private Long releaseId;
    private String releaseNo;
    private Long versionId;
    private Long artifactId;
    private String modelUUID;
    private boolean rollback;
    private String creator;
    private Date gmtCreat;
    private Date gmtModifie;

    /**
     * 构造方法包含验证
     */
    public Release(String releaseNo) {
        if (releaseNo == null || releaseNo.length() == 0 || !isValidNo(releaseNo)) {
            throw new ValidationException();
        }
        this.releaseNo = releaseNo;
    }

    /**
     * 验证版本名合法
     */
    private boolean isValidNo(String releaseNo) {
        // check releaseNo ...
        return true;
    }
}
