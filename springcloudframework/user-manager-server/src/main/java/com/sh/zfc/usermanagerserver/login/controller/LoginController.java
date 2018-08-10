package com.sh.zfc.usermanagerserver.login.controller;

import com.sh.zfc.usermanagerserver.login.requestvo.ExitRequest;
import com.sh.zfc.usermanagerserver.login.vo.LoginResponse;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class LoginController {

    @RequestMapping(value = "/login/i", method = RequestMethod.POST, params = {"userName", "password"})
    //@RequestParam(value="userName", required=true,defaultValue="World")
    public LoginResponse postLogin(@RequestParam String userName, @RequestParam String password) {
        return new LoginResponse(200,"OK");
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET, params = {"userName", "password"})
    //@RequestParam(value="userName", required=true,defaultValue="World")
    public LoginResponse getLogin(@RequestParam String userName, @RequestParam String password) {
        return new LoginResponse(200,"OKGET");
    }

    @RequestMapping(value = "/exit", method = RequestMethod.POST, consumes = "application/json")
    public LoginResponse postExit(@RequestBody ExitRequest exit) {
        return new LoginResponse(200,exit.getUserName());
    }

}
