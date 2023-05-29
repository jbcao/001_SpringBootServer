package com.src.practise.ood_design_principle.liskov;

/**
 * @author caojianbang
 * @date 2021/8/31 13:10
 */
public class Liskov2 {
    public static void main(String[] args) {
        Liskov2 liskov2 = new Liskov2();
        B b = liskov2.new B();
        System.out.println(b.func2(11, 4));
    }

    class Base {
/**
 * 这里这个基类可以不使用
 */
    }

    class A extends Base {
        int func1(int a, int b) {
            return a - b;
        }
    }

    //通过组合方式使用A
    class B extends Base {
        A a = new A();

        int func2(int a, int b) {
            return this.a.func1(a, b);
        }
    }
}
