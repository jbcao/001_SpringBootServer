package com.src.practise.ooc_spring.ooa_ioc.oof_post_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**bean后置处理器，在bean初始化之前和之后调用
 * @author caojianbang
 * @date 2020/10/16 23:35
 */

/**
 * 需要在bean.xml中配置HelloWorldBeanPostProcessor bean
 */
public class HelloWorldBeanPostProcessor implements BeanPostProcessor {

    @Override //在bean初始化之前调用
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInitialization==========>"+beanName);
        return bean;
    }

    @Override //在bean初始化之后调用
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization==========>"+beanName);
        return bean;
    }
}
