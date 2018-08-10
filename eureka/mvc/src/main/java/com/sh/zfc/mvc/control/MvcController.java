package com.sh.zfc.mvc.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MvcController {
    //    @RequestMapping("/")
//    public String root(){
//        return "redirect:/index";
//    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/user/index", method = RequestMethod.GET)
    public String userIndex(){
        return "/user/index";
    }

    @RequestMapping("/log")
    public String login(){
        return "login";
    }

    @RequestMapping("/sta")
    public String staticPage(){
        return "static";
    }

//
//    @RequestMapping("/login-error")
//    public String loginError(Model model){
//        model.addAttribute("loginError",true);
//        return "login";
//    }
//
//    @RequestMapping("/401")
//    public String accessDeny(){
//        return "401";
//    }
}
