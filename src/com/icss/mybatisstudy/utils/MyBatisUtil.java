package com.icss.mybatisstudy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.Reader;
public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try{
            Reader reader = Resources.getResourceAsReader("conf/mybatis_config.xml");
            sqlSessionFactory  = new SqlSessionFactoryBuilder().build(reader);
//            sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
}
