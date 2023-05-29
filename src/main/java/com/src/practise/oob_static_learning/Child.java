package com.src.practise.oob_static_learning;

/**
 * @author caojianbang
 * @date 2021/9/28 23:40
 */
public class Child {
    int age;
    String name;
    //static修饰变量，任何对象都可以访问
    static int total=0;

    public Child(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void joinGame() {
        total++;
        System.out.println("有人加入");
    }

    public static void main(String[] args) {
        Child child = new Child(4,"xiii1");
        Child child2 = new Child(4,"xiii2");
        Child child3 = new Child(4,"xiii3");
        Child child4 = new Child(4,"xiii4");
        child.joinGame();
        child2.joinGame();
        child3.joinGame();
        child4.joinGame();
        //可以这么用,但不推荐
        System.out.println("一共有"+child2.total);
        System.out.println("一共有"+Child.total);
    }
}
