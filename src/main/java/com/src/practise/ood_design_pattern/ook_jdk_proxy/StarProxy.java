package com.src.practise.ood_design_pattern.ook_jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 明星经纪人作为明星的代理，处于客户与刘德华的中间环节，作为双方中介
 * 参考文章：https://blog.csdn.net/flyfeifei66/article/details/81481222
 */
public class StarProxy implements InvocationHandler {
    //目标类，也就是将要被代理的对象，是真实的目标对象
    //private成员只能在类自身中进行访问
    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 绑定委托对象并返回一个代理类
     *
     * @param target
     * @return
     */
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 通过代理对象调用方法 首先进入这个方法
     *
     * @param proxy  代理对象
     * @param method 被调用方法
     * @param args   方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //TODO err内容需要研究一下
        System.err.println("#################我是JDK动态代理##################");
        //控制访问（刘德华）真正的服务对象，并提供额外的服务
        //在反射方法前调用
        System.err.println("代理执行动作:收客户的钱，让刘德华前往表演");
        //执行方法，相当于调用LiuDeHua 类的方法
        Object result = method.invoke(target, args);
        //在反射方法后调用
        System.err.println("刘德华:刘德华完成表演了,感谢各位捧场");
        return result;
    }
}
