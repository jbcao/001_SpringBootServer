package com.src.practise.ood_design_pattern.oob_factory.simple_factroy2;

/**
 * @author caojianbang
 * @date 2021/9/8 22:12
 */
public class FruitGardener {
    /**
     * 静态工厂方法
     *
     * @return
     */
    public static Fruit createFruitFactory(String type) {
        Fruit fruit = null;
        try {
            if (type.equalsIgnoreCase("apple")) {
                fruit = new Apple();
            } else if (type.equalsIgnoreCase("grape")) {
                fruit = new Grape();
            }else {
                throw new BadFruitException("bad fruit reguest");
            }
            return fruit;
        } catch (BadFruitException e) {
            e.printStackTrace();
            return fruit;
        }
    }
}