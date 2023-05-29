package com.src.practise.ooc_spring.ooa_ioc.ooa_bean_factory;

import com.src.practise.ooc_spring.HelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author caojianbang
 * @date 2020/10/9 22:08
 */

/**
 * BeanFactory 容器介绍：
 *
 * 1、这是一个最简单的容器，它主要的功能是为依赖注入 （DI） 提供支持
 *
 * 2、这个容器接口在 org.springframework.beans.factory.BeanFactory中被定义
 *
 * 3、BeanFactory和相关的接口，比如BeanFactoryAware、DisposableBean、InitializingBean，仍旧保留在 Spring 中，主要目的是兼容已经存在的和那些 Spring 整合在一起的第三方框架。
 *
 * 4、在 Spring 中，有大量对BeanFactory 接口的实现,其中，最常被使用的是 XmlBeanFactory 类。
 * 这个容器从一个 XML 文件中读取配置元数据，由这些元数据来生成一个被配置化的系统或者应用。
 *
 *  5、在资源宝贵的移动设备或者基于applet的应用当中， BeanFactory 会被优先选择。
 * 否则，一般使用的是 ApplicationContext，除非你有更好的理由选择 BeanFactory。
 */
public class MainApp {
    public static void main(String[] args) {
        Resource resource;
        /**
         * 第一步利用框架提供的 XmlBeanFactory() API 去生成工厂 bean
         *       以及利用 ClassPathResource() API 去加载在路径 CLASSPATH 下可用的 bean 配置文件。
         *       XmlBeanFactory() API 负责创建并初始化所有的对象，即在配置文件中提到的 bean。
         */

        /**
         * 第二步利用第一步生成的 bean 工厂对象的 getBean() 方法得到所需要的 bean。
         *       这个方法通过配置文件中的 bean ID 来返回一个真正的对象，该对象最后可以用于实际的对象。
         *       一旦得到这个对象，你就可以利用这个对象来调用任何方法。
         */

        BeanFactory beanFactory =new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("beanFactoryHelloWorld");
        helloWorld.getMessage();
    }
}
