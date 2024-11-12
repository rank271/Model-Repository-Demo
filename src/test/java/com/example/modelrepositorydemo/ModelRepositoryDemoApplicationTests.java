package com.example.modelrepositorydemo;

import com.example.modelrepositorydemo.Entity.Artifact;
import com.example.modelrepositorydemo.Entity.Release;
import com.example.modelrepositorydemo.dao.ArtifactMapper;
import com.example.modelrepositorydemo.dao.ReleaseMapper;
import com.example.modelrepositorydemo.repository.ReleaseRepository;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
//@MapperScan(value = "com.example.modelrepositorydemo.dao")
class ModelRepositoryDemoApplicationTests {
    @Autowired
    private ReleaseMapper releaseMapper;
    @Autowired
    private ArtifactMapper artifactMapper;
    @Autowired
    private ReleaseRepository releaseRepository;
    @Test
    void contextLoads() {

//        List<Release> allRelease = releaseMapper.getAllRelease();
//        System.out.println(allRelease);

//        Artifact arti = artifactMapper.findByGroupNameAndName("group123","artifact123");
//        System.out.println(arti);

        boolean b = releaseRepository.updateRollBack(12345L, true);
        System.out.println(b);


    }

}
