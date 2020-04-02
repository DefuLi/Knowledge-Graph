package com.example.demo.controller;

import com.example.demo.service.KGRelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class KGRelaController {
    @Autowired
    KGRelaService kgRelaService;
    @ResponseBody
    @RequestMapping(value = "/kgrela", method = RequestMethod.GET)
    public String getKGRela() {
        return kgRelaService.getKGRela();
    }
}
