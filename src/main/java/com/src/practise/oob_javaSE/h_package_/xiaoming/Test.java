package com.src.practise.oob_javaSE.h_package_.xiaoming;

/**
 * @author caojianbang
 * @date 2021/11/4 17:25
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //本包访问，a,name,,color，可以访问，price不可以被访问
        System.out.println(dog.a);
    }
}

class Dog {
    public int a;
    protected String name;
    String color;
    private float price;

    //本类访问范围，a,name,,color,price都可以访问
    //不仅属性这样，访问修饰符修饰的方法也是这样
    private void ab() {
        System.out.println(this.a);
    }
}
