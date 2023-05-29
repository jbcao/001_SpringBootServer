package com.src.practise.ooc_spring.oob_di.ooa_based_on_constructor;

/**
 * @author caojianbang
 * @date 2020/11/4 21:41
 */
public class Student {
    public Student(String name){
        System.out.println(name);
    }
    public Student(int age){
        System.out.println(age);
    }
    public Student(String name,int age){
        System.out.println(name+";"+age);
    }
}
