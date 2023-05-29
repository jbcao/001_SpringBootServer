package com.src.practise.ooc_hibernate_connectivity;
import java.util.Date;

import com.src.entity.TUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    public static void main(String[] args) {
        //1.创建要测试的对象
       TUser tUser = new TUser();
       /**
        *使用GenerateAllSetter执行对象所有set方法
        */
       tUser.setUserName("HibernateTest");
       tUser.setNickName("HibernateTest");
       tUser.setPassword("Hiber");
       tUser.setAge(15);
       tUser.setIdCard("1111111");
       tUser.setPhoneNumber("13655454");
       tUser.setTelephone("1444");
       tUser.seteMail("dldl");
       tUser.setCreateTime(new Date());
        //2.加载配置信息
        Configuration conf = new Configuration().configure();
        //3.基于配置信息,创建SessionFactory对象
        SessionFactory sessionFactory = conf.buildSessionFactory();
        //4.打开一个与数据库相关的session对象
        Session session = sessionFactory.openSession();
        //5.开启事务,基于session得到
        Transaction transaction = session.beginTransaction();
        //6.通过session保存数据
        session.save(tUser);
        //7.提交事务
        transaction.commit();
        //8.操作完毕,关闭session连接对象
        session.close();
    }
}
