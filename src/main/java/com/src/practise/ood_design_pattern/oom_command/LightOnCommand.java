package com.src.practise.ood_design_pattern.oom_command;

public class LightOnCommand implements Command {

    //聚合LightReceiver
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
