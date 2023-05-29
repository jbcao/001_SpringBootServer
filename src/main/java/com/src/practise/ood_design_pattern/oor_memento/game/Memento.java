package com.src.practise.ood_design_pattern.oor_memento.game;

public class Memento {
    //攻击力
    private int vit;
    //防御力
    private  int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public Memento setVit(int vit) {
        this.vit = vit;
        return this;
    }

    public int getDef() {
        return def;
    }

    public Memento setDef(int def) {
        this.def = def;
        return this;
    }
}
