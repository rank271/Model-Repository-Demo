package com.example.modelrepositorydemo.controller;

import com.example.modelrepositorydemo.Entity.Artifact;
import com.example.modelrepositorydemo.Entity.Group;
import com.example.modelrepositorydemo.Entity.Release;
import com.example.modelrepositorydemo.Entity.User;
import com.example.modelrepositorydemo.service.logService;
import com.example.modelrepositorydemo.service.rollBackService;
import com.example.modelrepositorydemo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @className: LabelController
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Controller
@RequestMapping("/")
public class LabelController {
    @Autowired
    private rollBackService rollBackService;

    /**
     * 前端调用：DELETE/groups/{name}/artifacts/{name}/releases/{release_no}
     */
    @ResponseBody
    @DeleteMapping("groups/{groupName}/artifacts/{artifactName}/releases/{releaseNo}")
    public String rollBackLabel(@PathVariable("groupName") String groupName, @PathVariable("artifactName") String artifactName, @PathVariable("releaseNo") String releaseNo) {
        // 部门、仓库、版本
        Group group = new Group(groupName);
        Artifact artifact = new Artifact(artifactName);
        Release release = new Release(releaseNo);

        // 标记有问题的版本
        boolean rollBack = rollBackService.rollBack(group, artifact, release);

        return String.valueOf(rollBack);
    }
}
