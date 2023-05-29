package com.src.practise.ooc_hibernate_connectivity;

import com.src.entity.TUser;
import org.hibernate.Session;


/**
 * 相对于JDBC编程，Hibernate编程有如下好处：
 * 一、消除了代码的映射规则，全部被分离到了XML或注解里面去配置
 * 二、无需管理数据库连接，也被配置到了XML里面
 * 三、一个会话中，不需要操作多个对象，只要操作Session对象即可
 * 四、关闭资源也只需要关闭一个Session即可
 *
 *
 * 缺点：
 * 一、全表映射带来的不便，比如更新时需要发送所有字段
 * 二、无法根据不同的条件组装不同的SQL
 * 三、对多表关联和复杂SQL查询支持较差，需要自己写SQL，返回结果后，需要自己将数据组装为POJO
 * 四、不能有效支持存储过程
 * 五、虽然有HQL，但是性能较差，大型互联网系统往往需要优化SQL，而Hibernate做不到
 *
 * 解决方式：MyBatis
 *
 */


public class HibernateExample {
    public static void main(String[] args) {
        Session session = null;
        session = HibernateUtil.getSessionFactory().openSession();
        TUser tUser = session.load(TUser.class, 1);
        System.out.println("姓名：" + tUser.getUserName());
        session.close();
    }
}
