package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author caojianbang
 * @date 2020/11/11 0:01
 */
@Configuration
public class ScopeAppConfig {
    @Bean
    //指定 Bean 的范围：
    //默认范围是单实例，但是你可以重写带有@Scope注解的该方法
    @Scope("prototype")
    public Foo foo(){
        return new Foo();
    }
}
