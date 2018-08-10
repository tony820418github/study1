package com.zfc.security.service;

import com.zfc.security.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public List findALLUser() {
        return userMapper.findAllUser();
    }
}
