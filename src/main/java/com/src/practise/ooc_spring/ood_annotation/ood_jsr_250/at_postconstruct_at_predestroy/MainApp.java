package com.src.practise.ooc_spring.ood_annotation.ood_jsr_250.at_postconstruct_at_predestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/9 22:08
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans_@PostConstruct_@PreDestroy.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.getMessage();
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
    }
}
