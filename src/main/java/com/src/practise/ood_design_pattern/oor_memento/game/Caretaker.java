package com.src.practise.ood_design_pattern.oor_memento.game;

public class Caretaker {
    //如果只保存一次状态
    private Memento memento;

    //对 GameRole 保存多次状态
    //privateArrayList<Memento> mementos;
    //对多个游戏角色保存多个状态
    //private HashMap<String, ArrayList<Memento>> rolesMementos;
    public Memento getMemento() {
        return memento;
    }

    public Caretaker setMemento(Memento memento) {
        this.memento = memento;
        return this;
    }
}
