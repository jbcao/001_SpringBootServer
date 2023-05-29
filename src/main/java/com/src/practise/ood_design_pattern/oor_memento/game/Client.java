package com.src.practise.ood_design_pattern.oor_memento.game;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole(100,100);
        System.out.println("大战前状态");
        gameRole.display();

        //将状态保存到caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战");
        gameRole.setDef(30);
        gameRole.setVit(30);

        gameRole.display();
        System.out.println("大战后，使用备忘录恢复到以前");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();
    }
}
