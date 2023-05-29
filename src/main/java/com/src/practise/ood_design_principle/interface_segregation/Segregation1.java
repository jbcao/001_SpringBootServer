package com.src.practise.ood_design_principle.interface_segregation;

public class Segregation1 {
    public static void main(String[] args) {
        Segregation1 segregation1 =new Segregation1();
        A a = segregation1.new A();
        a.depend1(segregation1.new B());
        a.depend2(segregation1.new B());
        a.depend3(segregation1.new B());
        C c = segregation1.new C();
        c.depend1(segregation1.new D());
        c.depend4(segregation1.new D());
        c.depend5(segregation1.new D());
    }

    class A {//A类通过接口Interface1依赖（使用）B类，但是只用到接口中1,2,3方法

        void depend1(Interface1 interface1) {
            interface1.operation1();
        }

        void depend2(Interface1 interface1) {
            interface1.operation2();
        }

        void depend3(Interface1 interface1) {
            interface1.operation3();
        }
    }

    class C {//C类通过接口Interface1依赖（使用）D类，但是只用到接口中1,4,5方法
        void depend1(Interface1 interface1) {
            interface1.operation1();
        }

        void depend4(Interface1 interface1) {
            interface1.operation4();
        }

        void depend5(Interface1 interface1) {
            interface1.operation5();
        }
    }

    interface Interface1 {
        void operation1();

        void operation2();

        void operation3();

        void operation4();

        void operation5();

    }

    class B implements Interface1 {
        @Override
        public void operation1() {
            System.out.println("B实现了接口的operation1方法");
        }

        @Override
        public void operation2() {
            System.out.println("B实现了接口的operation2方法");
        }

        @Override
        public void operation3() {
            System.out.println("B实现了接口的operation3方法");
        }

        @Override
        public void operation4() {
            System.out.println("B实现了接口的operation4方法");
        }

        @Override
        public void operation5() {
            System.out.println("B实现了接口的operation5方法");
        }
    }

    class D implements Interface1 {
        @Override
        public void operation1() {
            System.out.println("D实现了接口的operation1方法");
        }

        @Override
        public void operation2() {
            System.out.println("D实现了接口的operation2方法");
        }

        @Override
        public void operation3() {
            System.out.println("D实现了接口的operation3方法");
        }

        @Override
        public void operation4() {
            System.out.println("D实现了接口的operation4方法");
        }

        @Override
        public void operation5() {
            System.out.println("D实现了接口的operation5方法");
        }
    }
}
