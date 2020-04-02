package com.example.demo.conversation;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConverModelImp implements ConverModel {

    @Override
    public String getConversation() {
        // okhttp通信
        return "你好啊，这里是全新的世界!";
    }
}
