/**
 * @author caojianbang
 * @date 2020/11/6 0:34
 */
package com.src.practise.ooc_spring.ooc_autowire;

/**
 * 自动装配模式
 *
 *   spring容器在不使用<constructor-arg>和<property>标签情况下自动
 *
 *   装配相互协作的bean之间的关系
 *
 *   有助于减少基于XML配置的数量
 *
 *
 */

/**
 * 自动装配模式
 *
 *     使用<bean>标签的autowire属性为bean指定自动装配模式
 *
 *  no          默认设置，意味着没有自动装配
 *
 *  byName      由属性名自动装配，Spring 容器看到在 XML 配置文件中 bean 的自动装配的属性设置为 byName。
 *
 *              然后尝试匹配，并且将它的属性与在配置文件中被定义为相同名称的 beans 的属性进行连接
 *
 *  byType      由属性数据类型自动装配，Spring 容器看到在 XML 配置文件中 bean 的自动装配的属性设置为 byType。
 *
 *              然后如果它的类型匹配配置文件中的一个确切的 bean 名称，它将尝试匹配和连接属性的类型。
 *
 *              如果存在不止一个这样的 bean，则一个致命的异常将会被抛出。
 *
 *  constructor 类似于 byType，但该类型适用于构造函数参数类型。如果在容器中没有一个构造函数参数类型的 bean，则一个致命错误将会发生。
 *
 *
 *     可以使用 byType 或者 constructor 自动装配模式来连接数组和其他类型的集合
 */



/**
 * 自动装配模式局限性
 *
 *   重写的可能性   你可以使用总是重写自动装配的 <constructor-arg>和 <property> 设置来指定依赖关系
 *
 *   原始数据类型   你不能自动装配所谓的简单类型包括基本类型，字符串和类。
 *
 *   混乱的本质     自动装配不如显式装配精确，所以如果可能的话尽可能使用显式装配
 */
