package com.sh.zfc.mybatisfirst.service;

import com.sh.zfc.mybatisfirst.dao.UserMapper;
import com.sh.zfc.mybatisfirst.entity.Blog;
import com.sh.zfc.mybatisfirst.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper ;

    public User getUserById(int id){
        return userMapper.getUserById(id);
    }

    public User getUserByName(String name){
        return  userMapper.getUserByName(name);
    }

    public Blog getBolog(int blogId){
        return userMapper.getBlog(blogId);
    }

//    public  User getUserRoleById(int id){
//        return userMapper.getUserRoleById(id);
//    }

   public HashMap getAllUserIntoMap(){
        return userMapper.getAllUserIntoMap();
    }

}
