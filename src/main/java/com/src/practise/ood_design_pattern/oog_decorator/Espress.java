package com.src.practise.ood_design_pattern.oog_decorator;

/**
 * 意大利咖啡
 * 价格在点咖啡的时候，就给到他
 */
public class Espress extends Coffee {
    public Espress() {
        setDes("意大利咖啡");
        setPrice(6.0f);
    }
}
