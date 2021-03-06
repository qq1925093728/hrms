package com.pace2car.shiro.dao;

import com.pace2car.shiro.bean.UserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByUserIdSelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}