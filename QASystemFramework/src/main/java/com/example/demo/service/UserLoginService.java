package com.example.demo.service;

import com.example.demo.dao.UserLoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    @Autowired
    UserLoginDao userLoginDao;

    public String login() {
        return userLoginDao.login();
    }

}
