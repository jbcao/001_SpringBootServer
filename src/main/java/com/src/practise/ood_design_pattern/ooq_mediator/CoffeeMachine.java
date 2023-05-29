package com.src.practise.ood_design_pattern.ooq_mediator;

public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    /**
     * 状态标志符
     * @param statChange
     */
    @Override
    public void sendMessage(int statChange) {
        this.getMediator().getMessage(statChange, this.name);
    }

    public void startCoffee() {
        System.out.println("it is time to start coffee");
    }

    public void finishCoffee() {
        System.out.println("after 5 inutes!");
        System.out.println("coffee is ok");
        sendMessage(0);
    }
}
