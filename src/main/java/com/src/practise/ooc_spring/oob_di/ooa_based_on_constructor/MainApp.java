package com.src.practise.ooc_spring.oob_di.ooa_based_on_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/9 22:08
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
        textEditor.spellcheck();
    }
}
