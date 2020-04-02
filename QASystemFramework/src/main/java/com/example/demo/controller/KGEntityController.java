package com.example.demo.controller;

import com.example.demo.service.KGEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 获取知识图谱中的实体信息
 */
@Controller
@RequestMapping(value = "/user")
public class KGEntityController {
    @Autowired
    KGEntityService kgEntityService;
    @ResponseBody
    @RequestMapping(value = "/kgentity", method = RequestMethod.GET)
    public String getKGEntity() {
        return kgEntityService.getKGEntity();
    }

}
