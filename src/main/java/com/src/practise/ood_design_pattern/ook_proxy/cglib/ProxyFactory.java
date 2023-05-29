package com.src.practise.ood_design_pattern.ook_proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author caojianbang
 * @date 2021/9/13 23:11
 */
public class ProxyFactory implements MethodInterceptor {
    /**
     * 聚合 维护一个目标对象
     */

    private Object target;

    /**
     * 构造器，传入一个被代理的对象
     */

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 返回一个代理对象，是target对象的代理对象
     * 属于java底层原理
     *
     * @return
     */

    public Object getProxyInstance() {
        //1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * 重写intercept 方法，会调用目标对象的方法
     *
     * @param o
     * @param method
     * @param objects
     * @param args
     * @return
     * @throws Throwable
     */

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy args) throws Throwable {
        System.out.println("cglib代理开始");
        Object returnVal = method.invoke(target, objects);
        System.out.println("结束");
        return returnVal;
    }
}
