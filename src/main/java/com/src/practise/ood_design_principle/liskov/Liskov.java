package com.src.practise.ood_design_principle.liskov;

/**
 * @author caojianbang
 * @date 2021/8/30 21:38
 * <p>
 * 里氏替换原则
 */
public class Liskov {
    public static void main(String[] args) {
        Liskov liskov = new Liskov();
        A a = liskov.new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("/n" + "---------------" + "/n");
        B b = liskov.new B();
        //这里本意是要求11-3
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("11+3+9=" + b.func2(11, 3));
      /*1)我们发现原来运行正常的相减功能发生了错误, 原因就是类B无意中重写了父类的方法, 造成原有功能出现错误。
        在实际程中, 我们常常会通过重写父类的方法完成新的功能, 这样写起来虽然简单,
        但整个继承体系的复用性往往会比较差, 别是运行多态比较频繁的时候

        2)通用的做法是:
        原来的父类和子类都继承一个更通俗的基类, 原有的继承关系去掉, 采用依赖, 聚合, 组合等关系代替

        重写父类方法，影响继承体系的复用性
        重写之后，可能会想着父类的方法，导致出错
        */
    }

    //A类
    class A {
        //返回两个数的差
        int func1(int a, int b) {
            return a - b;
        }
    }

    class B extends A {
        @Override
            //这里重写了A类的func1方法，可能是无意识的
        int func1(int a, int b) {
            return a + b;
        }

        int func2(int a, int b) {
            return func1(a, b) + 9;
        }
    }
}
