package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.at_import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author caojianbang
 * @date 2020/11/10 23:50
 */
@Configuration
public class ConfigA {
    @Bean
    public A a(){
        return new A();
    }

}
