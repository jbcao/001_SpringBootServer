package com.src.practise.oob_javaSE.e_object_oriented;

/**
 * 构造方法
 */
public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person(12, "顺平");
    }
}

class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }
}