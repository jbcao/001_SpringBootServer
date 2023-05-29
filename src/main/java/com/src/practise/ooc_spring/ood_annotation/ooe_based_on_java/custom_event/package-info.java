/**
 * @author caojianbang
 * @date 2020/11/11 23:20
 */
package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.custom_event;


/**
 *  自定义事件

 *
 */


/**
 *  实现步骤
 *
 *     1	创建一个名称为 SpringExample 的项目，并且在创建项目的 src 文件夹中创建一个包 com.tutorialspoint。
 *
 *     2	使用 Add External JARs 选项，添加所需的 Spring 库，解释见 Spring Hello World example 章节。
 *
 *     3	通过扩展 ApplicationEvent,创建一个事件类 CustomEvent。这个类必须定义一个默认的构造函数，它应该从 ApplicationEvent 类中继承的构造函数。
 *
 *     4	一旦定义事件类，你可以从任何类中发布它，假定 EventClassPublisher 实现了 ApplicationEventPublisherAware。你还需要在 XML 配置文件中声明这个类作为一个 bean，之所以容器可以识别 bean 作为事件发布者，是因为它实现了 ApplicationEventPublisherAware 接口。
 *
 *     5	发布的事件可以在一个类中被处理，假定 EventClassHandler 实现了 ApplicationListener 接口，而且实现了自定义事件的 onApplicationEvent 方法。
 *
 *     6	在 src 文件夹中创建 bean 的配置文件 Beans.xml 和 MainApp 类，它可以作为一个 Spring 应用程序来运行。
 *
 *     7	最后一步是创建的所有 Java 文件和 Bean 配置文件的内容，并运行应用程序，解释如下所示。
 *
 *
 *
 *
 */
