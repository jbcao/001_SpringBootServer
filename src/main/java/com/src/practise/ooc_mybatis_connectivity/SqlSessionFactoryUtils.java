package com.src.practise.ooc_mybatis_connectivity;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author caojianbang
 * @date 2020/9/26 15:16
 */
public class SqlSessionFactoryUtils {
    private static SqlSessionFactory sqlSessionFactory = null;

    public static SqlSessionFactory getSqlSessionFactory() {
        InputStream inputStream = null;
        if (sqlSessionFactory == null) {
            try {
                String resources = "mybatis_study/mybatis_config.xml";
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resources));
                return sqlSessionFactory;

            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return sqlSessionFactory;
    }

}