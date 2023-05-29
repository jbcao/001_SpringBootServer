package com.src.practise.oob_javaSE.f_static_;

/**
 * 类变量
 */
public class Demo {
    
    static int i = 1;

    /**
     * 重要！！！
     *
     *  静态代码块，静态区域块
     *
     *  创建这个类的时候，静态变量和静态代码块已经存在于代码区，并且执行一次，和对象创建无关
     *
     *  第一次创建对象时执行一次，后面创建对象时不执行
     */
    static {
        //用于测试
        System.out.println("静态代码块");
        i++;
    }

    public Demo() {
        //用于测试
        System.out.println("构造函数");
        i++;
    }

    public static void main(String[] args) {
//        //第一次创建对象时，静态代码块执行一次
//        Demo demo = new Demo();
//        System.out.println(demo.i);
//        //3
//        //再次创建对象时，静态代码不执行
//        Demo demo1 = new Demo();
//        System.out.println(demo1.i);
//        //4

        /**
         * 将上面代码块都注销后，也会打印“静态代码块”
         */
    }
}
