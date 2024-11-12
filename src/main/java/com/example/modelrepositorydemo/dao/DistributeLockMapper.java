package com.example.modelrepositorydemo.dao;

import com.example.modelrepositorydemo.Entity.DistributeLock;
import org.apache.ibatis.annotations.Mapper;

/**
 * @interfaceName: DistributeLockMapper
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Mapper
public interface DistributeLockMapper {

    DistributeLock selectDistributeLock(String businessCode);
}
