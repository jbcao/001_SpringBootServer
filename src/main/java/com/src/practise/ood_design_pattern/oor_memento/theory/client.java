package com.src.practise.ood_design_pattern.oor_memento.theory;

import javax.swing.text.Caret;

public class client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态1 攻击力100");
        //保存当前状态
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态2 攻击力80");
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态3 攻击力50");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前状态是=" + originator.getState());
        //希望回到状态1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("当前状态是=" + originator.getState());
    }
}
