package com.src.practise.ooc_spring.ood_annotation.ooa_at_required;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author caojianbang
 * @date 2020/11/6 22:42
 */
public class Student {
    private Integer age;
    private String name;
    private  String  message;

    public String getMessage() {
        System.out.println(message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getAge() {
        return age;
    }

    /**
     * @Required注解
     *
     *      一、用于setter方法
     *
     *      二、表明被注释的属性必须出现在XML配置文件中
     *
     *
     *
     *      本例指出age属性在XML配置文件中必须出现
     *
     * @param age
     */
    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
}
