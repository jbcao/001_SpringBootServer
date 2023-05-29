package com.src.practise.ooc_hibernate_connectivity;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 建立Hibernate的工厂对象，用它来做全局对象，产生Session接口
 */
public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY;

    static {
        Configuration configuration = new Configuration().configure("hibernate_study/hibernate.cfg.xml");
        SESSION_FACTORY = configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}
