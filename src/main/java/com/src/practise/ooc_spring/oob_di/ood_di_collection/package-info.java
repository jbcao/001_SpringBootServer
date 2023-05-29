/**
 * @author caojianbang
 * @date 2020/11/5 14:55
 */
package com.src.practise.ooc_spring.oob_di.ood_di_collection;
/**
 * 注入集合
 *     如果想要传递多个值，如 Java Collection 类型 List、Set、Map 和 Properties
 *
 * <list>   允许重复
 * <set>    不能重复
 * <map>    注入名称-值对的集合，其中名称的值可以为任何类型
 * <props>  注入名称-值对的集合，其中名称的值都是字符串类型
 *
 * 一、传递集合中直接的值
 * 二、传递一个bean引用作为集合中的元素，甚至可以将引用和值混用到一起
 *    <bean id="..." class="...">
 *
 *       <!-- Passing bean reference  for java.util.List -->
 *       <property name="addressList">
 *          <list>
 *             <ref bean="address1"/>
 *             <ref bean="address2"/>
 *             <value>Pakistan</value>
 *          </list>
 *       </property>
 *
 *       <!-- Passing bean reference  for java.util.Set -->
 *       <property name="addressSet">
 *          <set>
 *             <ref bean="address1"/>
 *             <ref bean="address2"/>
 *             <value>Pakistan</value>
 *          </set>
 *       </property>
 *
 *       <!-- Passing bean reference  for java.util.Map -->
 *       <property name="addressMap">
 *          <map>
 *             <entry key="one" value="INDIA"/>
 *             <entry key ="two" value-ref="address1"/>
 *             <entry key ="three" value-ref="address2"/>
 *          </map>
 *       </property>
 *
 *    </bean>
 *
 *    </beans>
 * 三、注入NULL和空字符串的值
 *    1、exampleBean.setEmail("")
 *     <bean id="..." class="exampleBean">
 *       <property name="email" value=""/>
 *     </bean>
 *
 *    2、exampleBean.setEmail(null)
 *    <bean id="..." class="exampleBean">
 *      <property name="email"><null/></property>
 *    </bean>
 */