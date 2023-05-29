package com.src.practise.ood_design_pattern.oob_factory.simple_factroy2;

/**
 * @author caojianbang
 * @date 2021/9/8 22:17
 */
public class Market {
    public static void main(String[] args) {
      Fruit fruit=  FruitGardener.createFruitFactory("Apple");
      fruit.grow();
    }
}
