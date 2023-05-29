package com.src.practise.ooc_spring.ooh_cache.simple_cache_manager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caojianbang
 * @date 2020/12/11 23:19
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring_Simple_Cache_Manager.xml");
        UserService userService = context.getBean(UserService.class);
        User user1 = userService.getUser(1);
        System.out.println(user1);
        User user2 = userService.getUser(1);
        System.out.println(user2);
    }


}
