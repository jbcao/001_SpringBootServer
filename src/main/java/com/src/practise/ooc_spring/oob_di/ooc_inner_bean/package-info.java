/**
 * @author caojianbang
 * @date 2020/11/5 2:53
 */
package com.src.practise.ooc_spring.oob_di.ooc_inner_bean;
/**
 * 内部beans
 *   在其他bean范围内定义的bean
 *
 *   <property />或<constructor-arg />元素中的<bean />元素称为内部bean
 *
 *   如下：
 *
 *    <bean id="outerBean" class="...">
 *       <property name="target">
 *          <bean id="innerBean" class="..."/>
 *       </property>
 *    </bean>
 *
 *
 */