package com.src.practise.ood_design_pattern.ooq_mediator;

public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int statChange) {
        this.getMediator().getMessage(statChange,this.name);
    }
    public void startTV(){
        System.out.println("it is time to start TV");
    }

    public void stopTV(){
        System.out.println("stop TV");
    }
}
