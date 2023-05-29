package com.src.practise.ood_design_pattern.ooq_mediator;

/**
 * 中介抽象类
 */
public abstract class Mediator {
    /**
     * 将给中介者对象，加入到集合中
     *
     * @param colleagueName
     * @param colleague
     */
    public abstract void register(String colleagueName, Colleague colleague);

    /**
     * 接受具体同事对象发出的消息
     *
     * @param stateChange
     * @param colleagueName
     */
    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();
}
