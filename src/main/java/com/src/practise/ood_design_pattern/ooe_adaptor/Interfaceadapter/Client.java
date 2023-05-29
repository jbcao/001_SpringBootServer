package com.src.practise.ood_design_pattern.ooe_adaptor.Interfaceadapter;

/**
 * @author caojianbang
 * @date 2021/9/22 23:36
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absadapter = new AbsAdapter() {
            //只需要覆盖我们需要使用的接口方法
            //这里提到了匿名内部类的概念，要了解
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        absadapter.m1();
    }
}
