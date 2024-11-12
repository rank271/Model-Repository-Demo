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
public class Group {
    private Long groupId;
    private String groupName;
    private String description;
    private Long organizationId;
    private String creator;
    private Date gmtCreat;
    private Date gmtModifie;

    /**
     * 构造方法包含验证
     */
    public Group(String name) throws ValidationException {
        if (name == null || name.length() == 0 || !isValidName(name)) {
            throw new ValidationException();
        }
        this.groupName = name;
    }
    /**
     * 验证部门名合法
     */
    private boolean isValidName(String name) {
        // check name ...
        return true;
    }
}
