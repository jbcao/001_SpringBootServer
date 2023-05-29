package com.src.practise.ooc_spring.ood_annotation.ooc_at_qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/9 22:08
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans_@Qualifier.xml");
        Profile profile = (Profile) applicationContext.getBean("profile");
        profile.printAge();
        profile.printName();
    }
}
