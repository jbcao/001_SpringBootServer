package com.src.practise.ood_design_pattern.oon_vistor;

public class Woman extends Person {
    /**
     * 这里使用双分派
     * 第一次分派：即首先在客户端程序中，将具体状态作为参数传递到Woman中
     * 第二次分派：然后woman类调用作为参数的“具体方法”中的getWomanResult()
     *             同时将自己作为参数传入
     *
     * @param action
     */
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
