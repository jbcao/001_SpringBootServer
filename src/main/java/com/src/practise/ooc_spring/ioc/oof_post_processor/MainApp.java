package com.src.practise.ooc_spring.ioc.oof_post_processor;

import com.src.practise.ooc_spring.ioc.ooe_life_cycle.LifeCycleBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/16 21:26
 */
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        LifeCycleBean lifeCycleBean = (LifeCycleBean) abstractApplicationContext.getBean("lifeCycle");
        lifeCycleBean.setMessage("Hello World");
        lifeCycleBean.getMessage();
        //程序退出前优雅关闭JVM
        abstractApplicationContext.registerShutdownHook();
    }
}
