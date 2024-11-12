package com.example.modelrepositorydemo.Entity;

import lombok.Data;
import java.util.Set;

/**
 * @className: User
 * @author: admin
 * @Version: 1.0
 * @description:
 */

@Data
public class User {
    /**
     * ID
     */
    private String userId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 角色
     */
    private String identity;
    /**
     * 邮箱
     */
    private String userMail;
    /**
     * 登录密码
     */
    private String loginPassword;
    /**
     * 状态 1 正常 0 无效
     */
    private Integer status;
    /**
     * 权限列表
     */
    private Set<String> perms;

    private enum operation{

    };

    public boolean checkPermission(){
        // 检查权限
        return true;
    }
}
