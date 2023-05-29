package com.src.practise.ood_design_pattern.oon_vistor;
/**
 * 接待访问
 *
 * */
public abstract class Person {
    //提供一个方法，让访问者可以访问

    public abstract void accept(Action action);
}
