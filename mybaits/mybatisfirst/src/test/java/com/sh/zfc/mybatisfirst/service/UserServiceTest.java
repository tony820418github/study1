package com.sh.zfc.mybatisfirst.service;

import com.sh.zfc.mybatisfirst.MybatisfirstApplication;
import com.sh.zfc.mybatisfirst.entity.Blog;
import com.sh.zfc.mybatisfirst.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatisfirstApplication.class)
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getUserById() {
       User user =  userService.getUserById(2);
       assertEquals("zfc" , user.getUsername());
       assertEquals(2, user.getBlogLists().size());
    }

    @Test
    public void getUserByName() {
        User user =  userService.getUserByName("zfc");
        assertEquals(new Integer(2) , user.getId());
    }

    @Test
    public void getBolog() {
        Blog blog =  userService.getBolog(1);
        assertEquals("zfc" , ((Blog) blog).getUser().getUsername());
    }

//    @Test
//    public void getUserRoleById() {
//        User user = userService.getUserRoleById(2);
//        assertEquals(2 , user.getRoles().size());
//    }


    @Test
    public void getAllUserIntoMap() {
        HashMap map = userService.getAllUserIntoMap();
        assertEquals(3 ,((HashMap) map).size());
    }
}