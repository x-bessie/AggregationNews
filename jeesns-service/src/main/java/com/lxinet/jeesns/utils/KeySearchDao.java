package com.lxinet.jeesns.utils;

import org.apache.ibatis.session.SqlSession;

public class KeySearchDao {

    //检索新闻插入
    public void insert(KeyName keyName) {
        SqlSession session = KeySearchDB.getSession();
        KeySearchMapper mapper = session.getMapper(KeySearchMapper.class);
        mapper.KeyInsert(keyName);
        session.commit();
        session.close();
    }

}
