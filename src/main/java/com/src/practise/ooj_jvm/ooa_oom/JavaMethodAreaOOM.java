package com.src.practise.ooj_jvm.ooa_oom;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 方法区溢出
 *
 * @author caojianbang
 * @date 2020/10/21 21:01
 */
public class JavaMethodAreaOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        while (true) {
            Enhancer enhancer = new Enhancer();

            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

                    return methodProxy.invokeSuper(o,objects);
                }
            });
         enhancer.create();

        }
    }
}
