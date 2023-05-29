/**
 * @author caojianbang
 * @date 2020/10/15 23:30
 */
package com.src.practise.ooc_spring.ioc.ooe_life_cycle;
/**
 * bean生命周期：
 *
 *  当bean被实例化时，需要执行初始化使他转换为可用状态；
 *  当不再需要，需要从容器中移除时，可能需要做一些清除工作
 */

/**
 * 生命周期：
 *      定义
 *      初始化
 *      使用
 *      销毁
 */

/**
 * 初始化回调
 *     方式一：需要实例化的bean实现org.springframework.beans.factory.InitializingBean 接口，
 *             实现其中afterPropertiesSet()方法
 *
 *     方式二：基于xml配置元数据的话，在需要实例化的bean中添加init-method="xxx" xxx方法为bean中方法，
 *             该方法为带有void的无参数方法
 */


/**
 * 销毁方法
 *     方式一：需要实例化的bean实现org.springframework.beans.factory.DisposableBean 接口中destroy()方法
 *
 *     方式二：基于xml配置元数据的话，在需要实例化的bean中添加destroy-method="xxx" xxx方法为bean中方法，
 *             该方法为带有void的无参数方法
 */

//建议采用第二种方式，因为xml配置元数据在方法的命名上比较灵活

/**
 * 默认的初始化和销毁方法：
 *   如果每个或有太多个bean都有初始化和销毁方法，可以配置默认初始化和销毁方法：
 *   <beans xmlns="http://www.springframework.org/schema/beans"
 *     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 *     xsi:schemaLocation="http://www.springframework.org/schema/beans
 *     http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
 *     default-init-method="init"
 *     default-destroy-method="destroy">
 */