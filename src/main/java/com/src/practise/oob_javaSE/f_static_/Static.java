package com.src.practise.oob_javaSE.f_static_;

public class Static {
    public static void main(String[] args) {
        Child child = new Child(12, "xiaoni");
        child.joinGame();
        Child child1 = new Child(13, "ciaol");
        child1.joinGame();
        System.out.println(child1.total);
    }
}

class Child {
    int age;
    String name;
    static int total = 0;

    public Child(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void joinGame() {
        total++;
        System.out.println("一个小孩加入");
    }
}


