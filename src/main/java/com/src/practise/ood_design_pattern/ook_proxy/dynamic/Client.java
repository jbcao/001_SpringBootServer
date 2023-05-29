package com.src.practise.ood_design_pattern.ook_proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDAO target = new TeacherDAO();
        //给目标对象，创建代理对象，可以转成ITeacherDAO
        ITeacherDAO proxyInstance = (ITeacherDAO) new ProxyFactory(target).getProxyInstance();
        //在内存中生成了动态代理对象
        System.out.println(proxyInstance.getClass());
        //通过代理对象，调用目标对象中的方法
        //proxyInstance.teach();
        proxyInstance.say("cjb");
    }
}
