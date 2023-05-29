package com.src.practise.oob_type_conversion;

/**
 * 类型转换
 *
 * @author caojianbang
 * @date 2021/9/15 16:12
 */
public class Conversion {
    public static void main(String[] args) {
        /**
         * 1.小数默认是double的
         * 2.数据类型可以自动从低精度向高精度转化，但反之不可，会损失精度
         * 3.低精度类型向高精度类型转换，称为低精度类型转换
         */
        //int a= 1.2;
        float a=20.55f;
        /**
         * 将高精度类型转换为低精度类型：强制类型转换
         */
        int b=(int)1.2;
        int c=(int)1.9;
        System.out.println("b="+b);
        System.out.println("c="+c);
        /**
         * 下面这段代码编译不通过
         */
        int d= 1;
        double e=4.5;
       // d=e;
        /**
         * 编译过程中的转换,会将f+3.6往高精度转换，所以下面的代码编译不通过
         *
         */
        int f =4;
        //int  b=f+3.6;


    }
}
