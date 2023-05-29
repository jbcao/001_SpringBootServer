package com.src.practise.ooc_spring;


/**
 * @author caojianbang
 * @date 2020/10/9 22:05
 */


public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your Message:" + message);
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
