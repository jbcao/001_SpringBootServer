package com.src.practise.ooc_spring.ooa_ioc.oog_bean_extend;

/**
 * @author caojianbang
 * @date 2020/11/2 21:06
 */
public class HelloIndia {
    private String message1;
    private String message2;
    private String message3;

    //get/set方法快捷键，alt+insert
    public void getMessage1() {
        System.out.println("India message========>" + message1);
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void getMessage2() {
        System.out.println("India message========>" + message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void getMessage3() {
        System.out.println("India message========>" + message3);
    }

    public void setMessage3(String message3) {
        this.message3 = message3;
    }
}
