package com.src.practise.ooc_spring.oog_transaction.declarative;


import com.src.practise.ooc_spring.oof_spring_jdbc.crud.Student;
import com.src.practise.ooc_spring.oof_spring_jdbc.crud.StudentJDBCTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans_CRUD.xml");

    }
}