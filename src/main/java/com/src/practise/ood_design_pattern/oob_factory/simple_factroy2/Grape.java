package com.src.practise.ood_design_pattern.oob_factory.simple_factroy2;

/**
 * @author caojianbang
 * @date 2021/9/8 22:03
 */
public class Grape implements Fruit {
    @Override
    public void grow() {
        log("grape is growing");
    }

    @Override
    public void harvest() {
        log("grape harvest");
    }

    @Override
    public void plant() {
        log("grape plant");
    }

    public static void log(String s) {
        System.out.println(s);
    }
}
