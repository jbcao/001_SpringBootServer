package com.src.practise.ooc_spring.ood_annotation.ooa_at_required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/9 22:08
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans_@Required.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.getAge());
        System.out.println(student.getName());
        student.getMessage();
    }
}
