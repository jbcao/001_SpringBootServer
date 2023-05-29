package com.src.practise.ood_design_pattern.ooq_mediator;

public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int statChange) {
        this.getMediator().getMessage(statChange, this.name);
    }
    public void upCurtains(){
        System.out.println("i am holding up curtains");
    }
}
