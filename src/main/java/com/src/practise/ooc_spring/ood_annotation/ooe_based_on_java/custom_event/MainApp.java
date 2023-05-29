package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.custom_event;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/9 22:08
 */
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("Beans_Custom_Event.xml");
        CustomEventPublisher customEventPublisher = (CustomEventPublisher) configurableApplicationContext.getBean("customEventPublisher");
        customEventPublisher.publish();

    }
}
