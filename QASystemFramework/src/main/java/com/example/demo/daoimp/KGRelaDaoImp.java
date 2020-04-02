package com.example.demo.daoimp;

import com.example.demo.dao.KGRelaDao;
import org.springframework.stereotype.Repository;
@Repository
public class KGRelaDaoImp implements KGRelaDao {
    @Override
    public String getKGRela() {
        return "小伙子，知识图谱的关系信息获取到了!";
    }
}
