package com.src.practise.ood_design_pattern.ook_proxy.cglib;

/**
 * @author caojianbang
 * @date 2021/9/13 23:23
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //获取代理对象，并将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
    }
}
