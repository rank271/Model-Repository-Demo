package com.example.modelrepositorydemo.Entity;

import com.example.modelrepositorydemo.exception.ValidationException;
import lombok.Data;

import java.util.Date;

/**
 * @className: Release
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Data
public class Artifact {
    private Long artifactId;
    private Long groupId;
    private String groupName;
    private String name;
    private String creator;
    private Date gmtCreat;
    private Date gmtModifie;

    /**
     * 构造方法包含验证
     */
    public Artifact(String name) throws ValidationException {
        if (name == null || name.length() == 0 || !isValidName(name)) {
            throw new ValidationException();
        }
        this.name = name;
    }
    /**
     * 验证仓库名合法
     */
    private boolean isValidName(String name) {
        // check name ...
        return true;
    }
}
