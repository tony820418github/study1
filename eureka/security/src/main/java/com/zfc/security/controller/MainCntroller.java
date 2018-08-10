package com.zfc.security.controller;

import com.zfc.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
class MainCntroller {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String root(){
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/user/index", method = RequestMethod.GET)
    public String userIndex(){
        return "/user/index";
    }

    @RequestMapping(value = "/user/all",produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    @ResponseBody
    public List userAll(){
        List list  =  userService.findALLUser();
        return list;
    }

    @RequestMapping("/login")
    public String login(){
        System.out.println("call the login method");
        return "login";
    }



    @RequestMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError",true);
        return "login";
    }

    @RequestMapping("/401")
    public String accessDeny(){
        return "401";
    }
}
