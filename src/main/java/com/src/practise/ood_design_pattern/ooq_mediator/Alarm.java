package com.src.practise.ood_design_pattern.ooq_mediator;

/**
 * 具体同事类
 */
public class Alarm extends Colleague {
    /**
     * 构造器
     *
     * @param mediator
     * @param name
     */
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int statChange) {
        //调用中介者对象的getMessage
        this.getMediator().getMessage(statChange, this.name);
    }
}
