package com.src.practise.oob_javaSE.h_package_.xiaoqiang;

/**
 * @author caojianbang
 * @date 2021/11/4 17:26
 */

//import com.src.practise.oob_javaSE.h_package_.xiaoming.Cat;

public class Test {
    public static void main(String[] args) {

        /**
         *  使用不同类下面的包，可以
         *         1. 引入包
         *         2. 用包名.类名 进行使用
         *
         *  其他包中，只可以访问a,其他name,color,price都不能访问
         *
         *  对于访问不了，却非要访问，要提供public的成员方法
         */
        com.src.practise.oob_javaSE.h_package_.xiaoming.Cat cat = new
                com.src.practise.oob_javaSE.h_package_.xiaoming.Cat();
        System.out.println(cat.a);
    }
}
