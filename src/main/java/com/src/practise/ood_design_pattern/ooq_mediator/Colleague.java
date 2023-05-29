package com.src.practise.ood_design_pattern.ooq_mediator;

/**
 * 同事抽象类
 */
public abstract class Colleague {
    /**
     * 聚合中介者抽象类
     */
    private Mediator mediator;
    public String name;

    /**
     * 构造器
     *
     * @param mediator
     * @param name
     */
    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public Colleague setMediator(Mediator mediator) {
        this.mediator = mediator;
        return this;
    }

    public abstract void sendMessage(int statChange);
}
