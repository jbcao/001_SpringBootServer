/**
 * @author caojianbang
 * @date 2020/10/11 20:59
 */
package com.src.practise.ooc_spring.ioc.ooc_bean_definition;
/**
 *bean定义：
 *  1、bean对象是构成应用程序的支柱也是由 Spring IoC 容器管理的。
 *
 *  2、bean是一个被实例化，组装，并通过 Spring IoC 容器所管理的对象。
 *
 *  3、这些bean 是由用容器提供的配置元数据创建的，例如，已经在先前章节看到的，在XML的表单中的定义。
 *
 *总结：Spring IoC 容器所管理的对象
 */

/**
 * bean 定义包含称为配置元数据的信息，下述容器也需要知道配置元数据：
 *
 * 1.如何创建一个 bean
 *
 * 2.bean 的生命周期的详细信息
 *
 * 3.bean 的依赖关系
 *
 *元数据（Metadata），又称中介数据、中继数据，为描述数据的数据（data about data）
 *
 */

/**bean属性：
 *
 * class  这个属性是强制性的，并且指定创建bean的bean类
 *
 * name   这个属性指定唯一性bean标识符。在基于 XML 的配置元数据中，你可以使用 ID 和/或 name 属性来指定 bean 标识符。
 *
 * scope   这个属性指定由特定的 bean 定义创建的对象的作用域，它将会在 bean 作用域的章节中进行讨论。
 *
 * constructor-arg  它是用来注入依赖关系的，并会在接下来的章节中进行讨论。
 *
 * properties   它是用来注入依赖关系的，并会在接下来的章节中进行讨论。
 *
 * autowiring mode   它是用来注入依赖关系的，并会在接下来的章节中进行讨论。
 *
 * lazy-initialization mode   延迟初始化的 bean 告诉 IoC 容器在它第一次被请求时，而不是在启动时去创建一个 bean 实例。
 *
 * initialization方法   在 bean 的所有必需的属性被容器设置之后，调用回调方法。它将会在 bean 的生命周期章节中进行讨论。
 *
 * destruction方法   当包含该 bean 的容器被销毁时，使用回调方法。它将会在 bean 的生命周期章节中进行讨论。
 *
 */
/**
 * Bean与Spring 容器的关系:
 *
 * 1、读取bean配置信息（三种方式：XML、java类、注解）
 *
 * 2、根据bean注册表实例化bean
 *
 * 3、将bean实例放到bean缓存池（spring容器）
 *
 * 4、使用bean
 */
/**
 * Spring配置元数据（读取配置信息）方式：
 *
 * 1.基于 XML 的配置文件
 *
 * 2.基于注解的配置
 *
 * 3.基于 Java 的配置
 *
 */