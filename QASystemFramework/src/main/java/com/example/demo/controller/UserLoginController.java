package com.example.demo.controller;
import com.example.demo.service.UserLoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户登录
 */
@Controller
@RequestMapping(value = "/user")
public class UserLoginController {
    @Autowired
    UserLoginService userLoginService;
    @ResponseBody
    @RequestMapping(value = "/login")
    public String login(HttpServletRequest httpServletRequest) {
        return userLoginService.login();
    }
}
