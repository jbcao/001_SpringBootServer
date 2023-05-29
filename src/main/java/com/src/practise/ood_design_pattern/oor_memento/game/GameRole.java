package com.src.practise.ood_design_pattern.oor_memento.game;

public class GameRole {
    private int vit;
    private int def;

    public GameRole(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public Memento createMemento(){
        return new Memento(vit,def);
    }
    //从备忘录对象中，恢复gameRole的状态
    public void recoverGameRoleFromMemento(Memento memento){
        this.def=memento.getDef();
        this.vit=memento.getVit();
    }
    //显示当前游戏角色状态
    public void display(){
        System.out.println("游戏角色当前的攻击力：" + this.vit + " 防御力: " + this.def);
    }

    public int getVit() {
        return vit;
    }

    public GameRole setVit(int vit) {
        this.vit = vit;
        return this;
    }

    public int getDef() {
        return def;
    }

    public GameRole setDef(int def) {
        this.def = def;
        return this;
    }
}
