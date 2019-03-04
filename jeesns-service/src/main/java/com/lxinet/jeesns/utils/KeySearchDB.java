package com.lxinet.jeesns.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;


public class KeySearchDB {
    //  private static final Logger logger = LoggerFactory.getLogger(KeySearchDB.class);
    private static SqlSessionFactory sessionFactory;

    static {
        try {

            String resource = "mybatis-search.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sessionFactory.getConfiguration().addMapper(KeySearchMapper.class);
        } catch (Exception e) {
            System.out.println("init session factory failed err");
//      logger.error("init session factory failed. err: {}", e);
        }
    }

    public static SqlSession getSession() {
        return sessionFactory.openSession();
    }

    public static void main(String[] args) {
    KeySearchDB.getSession();
    }
}











