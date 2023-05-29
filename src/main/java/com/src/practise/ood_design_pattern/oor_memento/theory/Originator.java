package com.src.practise.ood_design_pattern.oor_memento.theory;

public class Originator {
    /**
     * 状态信息
     */
    private String state;

    /**
     * 编写一个方法，可以保存一个状态对象Memento
     * 因此编写一个方法，返回Memento
     *
     * @return
     */
    public Memento saveStateMemento() {
        return new Memento(state);
    }
    /**
     * 通过备忘录对象，回复状态
     *
     * @param memento
     */
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public Originator setState(String state) {
        this.state = state;
        return this;
    }
}
