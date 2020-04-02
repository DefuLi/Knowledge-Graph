package com.example.demo.el;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ELSearchImp implements ELSearch{
    @Override
    public String simiSearch() {
        return "小伙子，这里是相似性检索哦！";
    }

    @Override
    public String prefixSearch() {
        return "小伙子，这里是前缀词检索哦！";
    }
}
