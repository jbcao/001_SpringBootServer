package com.src.practise.ood_design_pattern.ook_proxy.staticproxy;

/**
 * @author caojianbang
 * @date 2021/9/12 0:28
 */
public class Client {
    public static void main(String[] args) {
        TeacherDAOProxy teacherDAOProxy = new TeacherDAOProxy(new TeacherDAO());
        teacherDAOProxy.teach();
    }
}
