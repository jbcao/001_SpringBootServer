package com.src.practise.ood_design_pattern.ood_builder.carbuilder;

/**
 * @author caojianbang
 * @date 2021/9/17 22:05
 */
public class Benz extends CarBuilder {
    @Override
    void createWheel() {
        System.out.println("benz creating wheel");
    }

    @Override
    void createGlass() {
        System.out.println("benz creating glass");
    }

    @Override
    void createEngin() {
        System.out.println("benz creating engin");
    }
}
