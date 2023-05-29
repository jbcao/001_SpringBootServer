package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.life_cycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author caojianbang
 * @date 2020/11/11 0:01
 */
@Configuration
public class AppConfigOfLifeCycle {
    //@Bean注解支持指定任意的初始化和销毁的回调方法
    // 就像在bean 元素中 Spring 的 XML 的初始化方法和销毁方法的属性
    @Bean(initMethod = "init",destroyMethod = "cleanup")
    public Foo foo(){
        return new Foo();
    }

}
