package com.example.demo.intention;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IRModelImp implements IRModel {
    @Override
    public boolean getIntention() {
        // okhttp通信
        return true;
    }
}
