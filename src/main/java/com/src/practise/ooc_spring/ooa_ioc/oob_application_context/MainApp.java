package com.src.practise.ooc_spring.ooa_ioc.oob_application_context;

import com.src.practise.ooc_spring.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/9 22:08
 */


public class MainApp {
    public static void main(String[] args) {
/** Application Context简介：
 *   1、Application Context 是 BeanFactory 的子接口，也被称为 Spring 上下文
 *
 *   2、Application Context 是 spring 中较高级的容器。和 BeanFactory 类似，
 * 它可以加载配置文件中定义的 bean，将所有的 bean 集中在一起，当有请求的时候分配 bean。
 *
 *   3、另外，它增加了企业所需要的功能，比如，从属性文件中解析文本信息和将事件传递给所指定的监听器。
 *
 *   4、这个容器在 org.springframework.context.ApplicationContext interface 接口中定义。
 *
 *   5、ApplicationContext 包含 BeanFactory 所有的功能，一般情况下，相对于 BeanFactory，
 *   ApplicationContext 会更加优秀。
 *
 *   当然，BeanFactory 仍可以在轻量级应用中使用，比如移动设备或者基于 applet 的应用程序。
 *
 */

/**
 * 最常被使用的 ApplicationContext 接口实现：
 *  1.FileSystemXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。
 *  在这里，你需要提供给构造器 XML 文件的完整路径。
 *
 *  2.ClassPathXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。
 *  在这里，你不需要提供 XML 文件的完整路径，只需正确配置 CLASSPATH 环境变量即可，因为，容器会从 CLASSPATH 中搜索 bean 配置文件。
 *
 *  3.WebXmlApplicationContext：该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。
 */

/**
 * 第一步生成工厂对象。加载完指定路径下 bean 配置文件后，利用框架提供的 FileSystemXmlApplicationContext API 去生成工厂 bean。
 * FileSystemXmlApplicationContext 负责生成和初始化所有的对象，比如，所有在 XML bean 配置文件中的 bean。
 *
 * 第二步利用第一步生成的上下文中的 getBean() 方法得到所需要的 bean。
 * 这个方法通过配置文件中的 bean ID 来返回一个真正的对象。一旦得到这个对象，就可以利用这个对象来调用任何方法。
 */
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\031_SVN-IDEA\\SpringBootServer\\src\\main\\resources\\Beans.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("applicationContextHelloWorld");
        helloWorld.getMessage();
    }
}
