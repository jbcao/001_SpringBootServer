package com.src.practise.ooc_spring.ooh_cache.simple_cache_manager;

/**
 * @author caojianbang
 * @date 2020/12/11 22:53
 */
public class User {
    private int id;
    private String name;

    public User(int id,String name) {
        this.id = id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
