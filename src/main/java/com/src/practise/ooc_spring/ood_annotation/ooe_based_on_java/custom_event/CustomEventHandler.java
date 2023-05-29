package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.custom_event;

import org.springframework.context.ApplicationListener;

/**
 * @author caojianbang
 * @date 2020/11/11 23:25
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }
}
