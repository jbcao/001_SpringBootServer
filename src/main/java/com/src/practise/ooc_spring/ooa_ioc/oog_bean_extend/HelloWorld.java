package com.src.practise.ooc_spring.ooa_ioc.oog_bean_extend;

/**
 * @author caojianbang
 * @date 2020/11/2 20:58
 */
public class HelloWorld {
    private String message1;
    private String message2;

    public void getMessage1() {
        System.out.println("world message========>" + message1);
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void getMessage2() {
        System.out.println("world message========>" + message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }
}
