package com.src.practise.ooc_spring.ioc.ooe_life_cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author caojianbang
 * @date 2020/10/16 21:36
 */

/**
 * 实现多个接口，要在接口中间加“，”
 */
public class LifeCycleBean implements InitializingBean,DisposableBean {
    private String message;

    public void getMessage() {
        System.out.println("Your Message:"+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        System.out.println("xml配置元数据方式：bean将要实现初始化");
    }
    public void beanDestroy()  {
        System.out.println("xml配置元数据方式：bean将要销毁");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("实现org.springframework.beans.factory.InitializingBean接口方式：bean将要初始化");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("实现org.springframework.beans.factory.DisposableBean接口方式：bean将要实现销毁");
    }
}
