package com.src.practise.ooc_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/9 22:08
 */
public class MainApp {
    public static void main(String[] args) {
        /**
         * 第一步、使用框架API ClassPathXmlApplicationContext（）来创建应用程序上下文
         *         这个API加载beans的配置文件，处理创建并初始化所有配置文件中提到的 beans
         * 第二步、使用已创建上下文的getBean()方法获取所需的bean
         *         根据bean的id返回一个最终可以转换为实际对象的通用对象，
         *         该对象可以调用该类的任何方法
         * 第三步、创建bean配置文件
         *         该文件需要在src下创建，名称的话可以随意
         *         必须确保该文件在classpath中可用
         * 通过更改“message”属性的值并保持两个源文件不变，可以看到Spring应用程序的灵活性
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.getMessage();
    }
}
