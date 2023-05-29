package com.src.practise.ooc_spring.ooh_cache.simple_cache_manager;

import org.springframework.cache.annotation.Cacheable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caojianbang
 * @date 2020/12/11 23:01
 */
public class UserService {
    private Map<Integer, User> users = new HashMap<Integer, User>();
    // TODO 为什么可以直接加花括号？
    {
        users.put(1, new User(1, "cao"));
        users.put(2, new User(2, "bb"));
    }
    //注解根据方法传入参数对返回值进行缓存
    @Cacheable(value = "users")
     public User getUser(int id){
         System.out.println("User with id " + id + " requested.");
         return users.get(id);
     }
}
