package com.src.practise.ood_design_pattern.oob_factory.simple_factroy2;

/**
 * @author caojianbang
 * @date 2021/9/8 22:04
 */
public class Apple implements Fruit{
    @Override
    public void grow() {
        log("apple is growing");
    }

    @Override
    public void harvest() {
        log("apple harvest");
    }

    @Override
    public void plant() {
        log("apple plant");
    }

    public static void log(String s) {
        System.out.println(s);
    }
}
