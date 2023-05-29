/**
 * @author caojianbang
 * @date 2020/11/5 2:45
 */
package com.src.practise.ooc_spring.oob_di.oob_based_on_setter;
/**
 *
 *   如果你有许多的设值函数方法，那么在 XML 配置文件中使用 p-namespace 是非常方便的。让我们查看一下区别：
 *
 *   以带有 标签的标准 XML 配置文件为例：
 *
 *    <bean id="john-classic" class="com.example.Person">
 *       <property name="name" value="John Doe"/>
 *       <property name="spouse" ref="jane"/>
 *    </bean>
 *
 *    <bean name="jane" class="com.example.Person">
 *       <property name="name" value="John Doe"/>
 *    </bean>
 *
 *    使用 p-namespace 以一种更简洁的方式重写，如下所示：
 *
 *    <bean id="john-classic" class="com.example.Person"
 *       p:name="John Doe"
 *       p:spouse-ref="jane"/>
 *    </bean>
 *
 *    <bean name="jane" class="com.example.Person"
 *       p:name="John Doe"/>
 *    </bean>
 *
 *
 *
 *
 *
 *
 */