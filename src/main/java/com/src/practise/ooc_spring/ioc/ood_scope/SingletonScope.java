package com.src.practise.ooc_spring.ioc.ood_scope;

import com.src.practise.ooc_spring.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/15 22:01
 */
public class SingletonScope {
    /**
     * singleton 作用域：
     *
     * 一、当一个bean的作用域为Singleton，那么Spring IoC容器中只会存在一个共享的bean实例，并且所有对bean的请求，
     *     只要id与该bean定义相匹配，则只会返回bean的同一实例。
     *     也就是说，当将一个bean定义设置为singleton作用域的时候，Spring IoC容器只会创建该bean定义的唯一实例
     *
     * 二、singleton 是默认的作用域，也就是说，当定义 Bean 时，如果没有指定作用域配置项，则 Bean 的作用域被默认为 singleton。
     *
     * 三、Singleton是单例类型，就是在创建起容器时就同时自动创建了一个bean的对象，
     *     不管你是否使用，他都存在了，每次获取到的对象都是同一个对象。
     *     注意，Singleton作用域是Spring中的缺省作用域。
     *
     * 四、你可以在 bean 的配置文件中设置作用域的属性为 singleton：scope="singleton"
     *
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("singletonScope");
        objA.setMessage("I'm object 单例作用域");
        objA.getMessage();
        HelloWorld objB = (HelloWorld) context.getBean("singletonScope");
        objB.getMessage();
    }
}
