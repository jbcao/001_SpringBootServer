package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.at_import;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author caojianbang
 * @date 2020/11/10 23:50
 */
@Configuration
//可以在另一个bean声明中导入上述bean声明
@Import(ConfigA.class)
public class ConfigB {
    @Bean
    public B b(){
        return new B();
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigB.class);
        //当实例化上下文时，不需要同时指定 ConfigA.class 和 ConfigB.class，只有 ConfigB 类需要提供
        A a = applicationContext.getBean(A.class);
        B b = applicationContext.getBean(B.class);

    }
}
