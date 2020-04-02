package com.example.demo.daoimp;

import com.example.demo.dao.UserLoginDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserLoginDaoImp implements UserLoginDao {

    @Override
    public String login() {
        return "小伙子，登录成功！";
    }
}
