package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/9 22:08
 */
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("Beans_Event.xml");
        configurableApplicationContext.start();
        HelloWorld helloWorld = (HelloWorld)configurableApplicationContext.getBean("helloWorld");
        helloWorld.getMessage();
        configurableApplicationContext.stop();

    }
}
