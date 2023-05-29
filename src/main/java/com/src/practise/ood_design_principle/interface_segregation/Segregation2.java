package com.src.practise.ood_design_principle.interface_segregation;

public class Segregation2 {
    public static void main(String[] args) {
        Segregation2 segregation2 = new Segregation2();
        A a = segregation2.new A();
        a.opreation1(segregation2.new B());
        a.opreation2(segregation2.new B());
        a.opreation3(segregation2.new B());
        C c = segregation2.new C();
        c.operation1(segregation2.new D());
        c.operation4(segregation2.new D());
        c.operation5(segregation2.new D());

    }

    interface Interface1 {
        void operation1();
    }

    interface Interface2 {
        void operation2();

        void operation3();
    }

    interface Interface3 {
        void operation4();

        void operation5();
    }

    class B implements Interface1,Interface2{
        @Override
        public void operation1() {
            System.out.println("B实现接口1的方法1");
        }

        @Override
        public void operation2() {
            System.out.println("B实现了接口2的方法2");
        }

        @Override
        public void operation3() {
            System.out.println("B实现了接口2的方法3");
        }
    }

    class  D implements Interface1,Interface3{
        @Override
        public void operation1() {
            System.out.println("D实现了接口1的方法1");
        }

        @Override
        public void operation4() {
            System.out.println("D实现接口3 的方法4");
        }

        @Override
        public void operation5() {
            System.out.println("D实现了接口3的方法5");
        }
    }

    class A{
        void opreation1(Interface1 interface1){
            interface1.operation1();
        }
        void opreation2(Interface2 interface2){
            interface2.operation2();

        }
        void opreation3(Interface2 interface2){
            interface2.operation3();

        }
    }

    class C{
        void operation1(Interface1 interface1){
            interface1.operation1();
        }
        void operation4(Interface3 interface1){
            interface1.operation4();
        }

        void operation5(Interface3 interface1) {
            interface1.operation5();
        }
    }
}
