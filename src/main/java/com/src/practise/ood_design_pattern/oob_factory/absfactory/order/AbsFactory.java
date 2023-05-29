package com.src.practise.ood_design_pattern.oob_factory.absfactory.order;

import com.src.practise.ood_design_pattern.oob_factory.absfactory.Pizza.Pizza;

/**
 * @author caojianbang
 * @date 2021/9/9 14:54
 */
//一个抽象工厂模式的抽象层（接口）
public interface AbsFactory {
    public Pizza createPizza(String orderType);

}
