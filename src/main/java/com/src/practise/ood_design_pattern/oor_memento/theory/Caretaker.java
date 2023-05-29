package com.src.practise.ood_design_pattern.oor_memento.theory;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    /**
     * 集合中要存放许多备忘录对象
     */
    private List<Memento> mementolist = new ArrayList<Memento>();
    public void add(Memento memento){
        mementolist.add(memento);
    }
    public Memento get(int index){
        return mementolist.get(index);
    }

}
