package com.example.modelrepositorydemo.dao;

import com.example.modelrepositorydemo.Entity.Log;
import com.example.modelrepositorydemo.Entity.Release;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @className: ReleaseMapper
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Mapper
public interface LogMapper {

    boolean save(Log log);
}
