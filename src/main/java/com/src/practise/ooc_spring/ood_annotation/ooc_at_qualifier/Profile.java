package com.src.practise.ooc_spring.ood_annotation.ooc_at_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author caojianbang
 * @date 2020/11/8 3:09
 */
public class Profile {
    @Autowired
    @Qualifier("student1")
    private  Student student;
    public Profile(){
        System.out.println("Inside Profile constructor.");
    }
    public void printAge(){
        System.out.println("Age========>"+student.getAge());
    }
    public void printName(){
        System.out.println("Name========>"+student.getName());
    }
}
