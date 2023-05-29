package com.src.practise.ooc_spring.ioc.ood_scope;


import com.src.practise.ooc_spring.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/15 22:01
 */
public class PrototypeScope {
/**
 * prototype(原型) 作用域:
 *
 *一、Prototype作用域的bean会导致在每次对该bean请求（将其注入到另一个bean中，或者以程序的方式调用容器的getBean()方法）时都会创建一个新的bean实例。
 *
 *二、当一个bean的作用域为Prototype，表示一个bean定义对应多个对象实例。
 *
 *三、Prototype是原型类型，它在我们创建容器的时候并没有实例化，而是当我们获取bean的时候才会去创建一个对象，而且我们每次获取到的对象都不是同一个对象。
 *
 *四、根据经验，对有状态的bean应该使用prototype作用域，而对无状态的bean则应该使用singleton作用域。
 */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("prototypeScope");
        objA.setMessage("I'm object 原型作用域");
        objA.getMessage();
        HelloWorld objB = (HelloWorld) context.getBean("prototypeScope");
        objB.getMessage();
    }
}
