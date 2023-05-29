package com.src.practise.oob_extend;

public class Son extends Father {
    @Override
    void f() {
        //执行父类中方法
        super.f();
        //下面是继承后重写的方法
        System.out.println("我是儿子");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.f();
    }

}
