package com.src.practise.ood_design_pattern.ook_proxy.staticproxy;

/**
 * @author caojianbang
 * @date 2021/9/12 0:26
 */
public class TeacherDAO implements ITeacherDAO {
    @Override
    public void teach() {
        System.out.println("teaching.....");
    }
}
