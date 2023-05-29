package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.dependence_of_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author caojianbang
 * @date 2020/11/10 23:01
 */

@Configuration
public class AppConfig {
    @Bean
    public Foo foo(){
     //当@Beans依赖对方时，只要一个bean方法调用另一个
        return new Foo(bar());

    }
    @Bean
    public Bar bar(){
        return new Bar();

    }


}
