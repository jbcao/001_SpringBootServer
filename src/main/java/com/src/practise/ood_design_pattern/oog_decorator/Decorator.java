package com.src.practise.ood_design_pattern.oog_decorator;

public class Decorator extends Drink {
    //聚合
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice是自己的价格
        return super.getPrice()+obj.cost();
    }
    @Override
    public String getDes(){
        //obj.getDes()输出被装饰者信息
        return super.des+" "+super.getPrice()+"&&"+obj.getDes();
    }
}
