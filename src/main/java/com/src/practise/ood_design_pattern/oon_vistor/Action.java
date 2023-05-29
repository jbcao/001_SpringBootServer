package com.src.practise.ood_design_pattern.oon_vistor;

public abstract class Action {
    //得到男性的测评,用于访问
    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);

}
