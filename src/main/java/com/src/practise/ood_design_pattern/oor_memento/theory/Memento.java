package com.src.practise.ood_design_pattern.oor_memento.theory;

public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public Memento setState(String state) {
        this.state = state;
        return this;
    }

    public Memento(String state) {
        this.state = state;
    }
}
