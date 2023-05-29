package com.src.practise.ooc_spring.ooa_ioc.oog_bean_extend;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/9 22:08
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("beanExtend");
        helloWorld.getMessage1();
        helloWorld.getMessage2();
        HelloIndia helloIndia = (HelloIndia) applicationContext.getBean("helloIndia");
        helloIndia.getMessage1();
        //创建helloIndia bean的时候并没有传递message2属性，但由于定义了继承，所以便传递了message2
        helloIndia.getMessage2();
        helloIndia.getMessage3();
    }
}