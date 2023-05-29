package com.src.practise.ood_design_pattern.ook_proxy.dynamic;

public class TeacherDAO implements ITeacherDAO {
    @Override
    public void say(String s) {
        System.out.println("hello"+s);
    }
    @Override
    public void teach() {
        System.out.println("teaching");
    }
}
