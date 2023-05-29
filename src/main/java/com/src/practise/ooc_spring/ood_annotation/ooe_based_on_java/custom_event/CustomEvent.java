package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.custom_event;

import org.springframework.context.ApplicationEvent;

/**
 * @author caojianbang
 * @date 2020/11/11 23:23
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    @Override
    public String toString(){
        return  "My Custom Event";
    }
}
