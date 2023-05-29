/**
 * @author caojianbang
 * @date 2020/10/10 21:45
 */
package com.src.practise.ooc_spring.ooa_ioc;
/**IOC容器：
 * 1、spring容器是spring框架的核心，容器用于创建对象、连接对象、配置他们
 *    并管理从创建到销毁整个生命周期
 *
 * 2、spring容器使用依赖注入DI来管理组成应用程序的组件，这些对象被称为
 * spring beans
 *
 * 3、IOC容器是具有依赖注入功能的容器，它可以创建对象，主要负责实例化、定位、
 * 配置应用程序中的对象并在这些对象间建立依赖（控制反转容器具有依赖注入功能）
 *
 * 4、通常new一个实例，控制权由程序员控制，而“控制反转”是指new实例工作不由程序员
 * 来做，而是由spring容器来做
 *
 * 两种不同类型的容器
 * 一、spring beanfactory容器
 *   1、它是最简单的容器，它给DI提供基本支持，
 *
 *   2、用org.springframework.beans.factory.BeanFactory接口来定义
 *
 *   3、BeanFactory以及相关接口如BeanFactoryAware，InitializingBean，DisposableBean，
 *      在 Spring 中可以与 第三方框架的整合
 *
 * 二、Spring ApplicationContext
 *   1.该容器添加了更多功能，例如从一个属性文件中解析文本信息的能力，发布应用程序事件给感兴趣的事件监听器的能力。
 *
 *   2.该容器由 org.springframework.context.ApplicationContext 接口定义。
 *
 *   3.ApplicationContext 容器包括 BeanFactory 容器的所有功能，所以通常不建议使用BeanFactory。
 *
 *   4.BeanFactory 仍然可以用于轻量级的应用程序，如移动设备或基于 applet(可以嵌入到网页的小应用程序)的应用程序，
 *     其中它的数据量和速度是显著。
 *
 *三、beanfactory以及applicationcontext只是最常用的两种，并不是只有这两种
 *
 *
 *
 *
 */