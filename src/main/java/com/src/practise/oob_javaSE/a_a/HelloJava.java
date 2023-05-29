package com.src.practise.oob_javaSE.a_a;

/**
 * @author caojianbang
 * @date 2021/7/24 16:26
 */
public class HelloJava {
    int a;
    B b;

    public static void main(String[] args) {
        HelloJava helloJava = new HelloJava();
        System.out.println("你好 java");
        System.out.println(helloJava.b);
        B b =null;
        System.out.println(b);
    }
}
class B{

}