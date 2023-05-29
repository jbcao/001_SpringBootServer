/**
 * @author caojianbang
 * @date 2020/11/6 22:23
 */
package com.src.practise.ooc_spring.ood_annotation;

/**
 * 基于注解的配置
 *
 *     不是采用XML来描述一个bean连线（依赖关联）
 *
 *     可以使用相关类，方法或字段声明的注解，将 bean 配置移动到组件类本身。
 *
 *     Spring 容器默认不打开注解连线，需要使用的话需要在Spring配置文件中启用它，加上：
 *
 *     <context:annotation-config/>
 *
 *     一配置后，使用注解的话，表明Spring应该自动将值连接到属性，方法和构造函数
 */

/**
 * @Required    应用于bean属性的setter方法
 *
 * @Autowired   应用到 bean 属性的setter方法,非setter方法,构造函数和属性
 *
 * @Qualifier   通过指定确切的将被连线的bean,@Autowired和@Qualifier注解可以用来删除混乱
 *
 * JSR-250 Annotations   Spring支持JSR-250的基础的注解，包括@Resource，@PostConstruct和@PreDestroy
 *
 *
 *
 */
