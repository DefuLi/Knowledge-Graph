package com.example.demo.service;

import com.example.demo.dao.KGRelaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KGRelaService {
    @Autowired
    private KGRelaDao kgRelaDao;
    public String getKGRela() {
        return kgRelaDao.getKGRela();
    }
}
