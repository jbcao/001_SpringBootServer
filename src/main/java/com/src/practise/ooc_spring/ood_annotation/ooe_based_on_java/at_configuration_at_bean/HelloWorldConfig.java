package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.at_configuration_at_bean;

import com.src.practise.ooc_spring.ood_annotation.ood_jsr_250.at_postconstruct_at_predestroy.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author caojianbang
 * @date 2020/11/10 21:48
 */

//该类可以作为bean定义的来源
@Configuration
public class HelloWorldConfig {
    /**
     * 该方法返回一个对象，是bean
     * <p>
     * 该方法名称作为bean的ID，通过该方法创建并返回实际的bean
     * <p>
     * 同一个配置类可以声明多个@Bean
     * <p>
     * 定义了配置类之后，可以使用AnnotationConfigApplicationContext来加载并把他们提供给Spring容器
     */

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

//以上代码相当于进行如下配置
/*
<beans>
<bean id="helloWorld" class="com.tutorialspoint.HelloWorld" />
</beans>
*/

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        helloWorld.setMessage("你好 世界");
        helloWorld.getMessage();

    }

}
