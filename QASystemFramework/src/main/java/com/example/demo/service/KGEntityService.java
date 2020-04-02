package com.example.demo.service;

import com.example.demo.dao.KGEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KGEntityService {
    @Autowired
    KGEntityDao kgEntityDao;

    public String getKGEntity() {
        return kgEntityDao.getKGEntity();
    }
}
