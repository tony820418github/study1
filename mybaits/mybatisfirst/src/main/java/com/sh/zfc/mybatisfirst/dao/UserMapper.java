package com.sh.zfc.mybatisfirst.dao;

import com.sh.zfc.mybatisfirst.entity.Blog;
import com.sh.zfc.mybatisfirst.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;

public interface UserMapper {
    User getUserById(int id);


    @Select("select * from user where username=#{name}")
    User getUserByName(String name);

    Blog getBlog(int blogId);

//    User getUserRoleById(int id);

    HashMap getAllUserIntoMap();
}
