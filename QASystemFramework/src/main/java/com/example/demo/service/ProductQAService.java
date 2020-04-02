package com.example.demo.service;

import com.example.demo.conversation.ConverModel;
import com.example.demo.el.ELSearch;
import com.example.demo.intention.IRModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductQAService {
    @Autowired
    IRModel irModel;
    @Autowired
    ConverModel converModel;
    @Autowired
    ELSearch elSearch;
    public String getAnswer() {
        if(irModel.getIntention()) {  // 意图没问题
            return elSearch.simiSearch();
        }else {
            return converModel.getConversation();
        }
    }
}
