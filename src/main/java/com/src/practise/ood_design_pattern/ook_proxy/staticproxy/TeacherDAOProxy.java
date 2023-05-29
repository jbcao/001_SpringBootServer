package com.src.practise.ood_design_pattern.ook_proxy.staticproxy;

/**
 * @author caojianbang
 * @date 2021/9/12 0:27
 */
public class TeacherDAOProxy implements ITeacherDAO {
    /**
     * 通过接口来进行来聚合
     */

    private ITeacherDAO iTeacherDAO;

    /**
     * 构造子
     *
     * @param iTeacherDAO
     */
    public TeacherDAOProxy(ITeacherDAO iTeacherDAO) {
        this.iTeacherDAO = iTeacherDAO;
    }

    @Override
    public void teach() {
        //代理主要目的是给目标对象进行功能增强
        System.out.println("preparing....");
        iTeacherDAO.teach();
        System.out.println("finished....");
    }
}
