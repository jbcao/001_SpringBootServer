package com.src.practise.oob_handle_pass;

/**
 * 引用
 *
 * @author caojianbang
 * @date 2021/9/27 13:59
 */
public class Person {
    private int age;
    private String name;

    /**
     * 默认构造方法
     * 程序员不写出来，创建其他的构造方法会被覆盖，
     * 这里写出来后，就可以调用，如果不写的话，调用它就会报错
     */
    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person a = new Person();
        a.age = 10;
        a.name = "xiaoming";
        Person b;
        b = a;
        /**
         * b的age还是10
         * b指向a的内存地址
         * b如果改变属性值，a的属性值也会改变
         */
        System.out.println(b.age);//10
        b.age = 15;
        System.out.println(a.age);//15
    }
}
