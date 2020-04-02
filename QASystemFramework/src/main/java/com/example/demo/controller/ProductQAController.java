package com.example.demo.controller;

import com.example.demo.service.ProductQAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class ProductQAController {
    @Autowired
    ProductQAService productQAService;

    @ResponseBody
    @RequestMapping(value = "productqa", method = RequestMethod.GET)
    public String getAnswer() {

        return productQAService.getAnswer();
    }
}
