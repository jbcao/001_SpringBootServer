package com.src.practise.ood_design_pattern.oob_factory.absfactory.Pizza;

/**
 * @author caojianbang
 * @date 2021/9/7 13:15
 */
//将pizza类做成抽象
public abstract class Pizza {
    //名字
    protected String name;

    //准备原材料，不同的pizza，原材料不一样，所以将方法抽象
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking");
    }

    public void cut() {
        System.out.println(name + "cutting");
    }

    public void box() {
        System.out.println(name + "boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
