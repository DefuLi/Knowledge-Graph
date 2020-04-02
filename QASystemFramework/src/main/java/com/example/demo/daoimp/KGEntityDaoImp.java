package com.example.demo.daoimp;

import com.example.demo.dao.KGEntityDao;
import org.springframework.stereotype.Repository;
@Repository
public class KGEntityDaoImp implements KGEntityDao {
    @Override
    public String getKGEntity() {
        return "小伙子，知识图谱的实体已经获取到啦！";
    }
}
