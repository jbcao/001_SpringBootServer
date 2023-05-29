/**
 * @author caojianbang
 * @date 2020/11/2 23:24
 */
package com.src.practise.ooc_spring.oob_di;
/**
 * 依赖注入
 *  spring框架的核心功能之一是使用DI来管理bean之间的依赖关系
 */

/**
 * 一、传递基本数据类型
 *    constructor-arg子标签：指定创建类对象时使用哪个构造函数，每一对或每一个constructor-arg子标签配置一个参数列表中的参数值；如果不配置子标签，则默认使用无参构造函数实例化对象
 *
 *    name属性：通过参数名找到参数列表中对应参数
 *
 *    index属性：通过参数在参数列表中的索引找到参数列表中对应参数，index从0开始：
 *
 *    type属性：通过参数数据类型找到参数列表中对应参数
 *
 *    value属性：设置参数列表参数对应的值，用于设定基本数据类型和String类型的数据
 *
 *    ref属性：如果参数值为非基本数据类型，则可通过ref为参数注入值，其值为另一个bean标签id或name属性的属性值
 *
 *    注：按照参数在参数列表中的正常顺序进行配置，此时不需要设置name、index或type属性；
 *    如果不按照参数在参数列表中的正常顺序进行配置，则需要设定name、index或type属性，否则配置错误。
 *
 *    name、index和type三个constructor-arg标签属性没有必要同时出现在constructor-arg标签中
 */