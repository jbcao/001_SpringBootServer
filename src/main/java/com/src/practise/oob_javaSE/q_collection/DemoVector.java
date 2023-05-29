package com.src.practise.oob_javaSE.q_collection;

import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) {
        Vector vector = new Vector();
        Emp emp = new Emp("2","jj",3.9f);
        vector.add(emp);
        for (int i = 0;i < vector.size();i++){
            Emp emp1 = (Emp) vector.get(i);

        }
    }
}
