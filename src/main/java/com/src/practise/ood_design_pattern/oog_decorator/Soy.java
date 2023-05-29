package com.src.practise.ood_design_pattern.oog_decorator;

/**
 * 豆浆
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("soy");
        setPrice(1.5f);    }
}
