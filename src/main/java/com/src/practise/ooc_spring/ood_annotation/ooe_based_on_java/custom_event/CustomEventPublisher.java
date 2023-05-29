package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.custom_event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author caojianbang
 * @date 2020/11/11 23:24
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {
   private ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }
    public void publish(){
        CustomEvent customEvent = new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
    }
}
