package com.zfc.security.dao;

import com.zfc.security.entity.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List findAllUser();

    User findByUserName(String username);
}