package com.src.practise.ooc_spring.ood_annotation.ood_jsr_250.at_postconstruct_at_predestroy;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author caojianbang
 * @date 2020/10/9 22:05
 */


public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your Message:" + message);
    }
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 初始化回调方法注解
     *
     * 可以代替bean配置文件中init-method="init"
     */
    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init");
    }
    /**
     * 销毁回调方法注解
     *
     * 可以代替bean配置文件中destroy-method="destroy"
     */
    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now");
    }
}
