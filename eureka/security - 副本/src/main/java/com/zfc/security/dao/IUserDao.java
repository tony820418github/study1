package com.zfc.security.dao;

import com.zfc.security.entity.UserJPA;

public interface IUserDao {
    UserJPA findByUsername(String username);
}
