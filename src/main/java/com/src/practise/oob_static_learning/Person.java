package com.src.practise.oob_static_learning;


public class Person {

    Book book1 = new Book("book1成员变量初始化");
    static Book book2;
    
    static {
        book2 = new Book("static成员book2成员变量初始化");
        book4 = new Book("static成员book4成员变量初始化");
    }
    
    public Person(String msg) {
        System.out.println(msg);
    }
    
    Book book3 = new Book("book3成员变量初始化");
    static Book book4;
    
    public static void funStatic() {
        System.out.println("static修饰的funStatic方法");
    }
    
    public static void main(String[] args) {
        Person.funStatic();
        System.out.println("****************");
        Person p1 = new Person("p1初始化");
    }
    /**Output
     * static成员book2成员变量初始化
     * static成员book4成员变量初始化
     * static修饰的funStatic方法
     * ***************
     * book1成员变量初始化
     * book3成员变量初始化
     * p1初始化
     *///~
}