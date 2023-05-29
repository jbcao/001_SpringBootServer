package com.src.practise.ood_design_pattern.ook_proxy.dynamic.reflection;

import java.lang.reflect.Field;

/**
 * @author caojianbang
 * @date 2021/9/3 0:29
 */
public class Test {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.src.practise.ood_design_pattern.ook_proxy.dynamic.reflection.UserEntity");
            UserEntity userEntity1 = (UserEntity) aClass.newInstance();
            //私有属性也可以反射出来
            Field[] fields = aClass.getDeclaredFields();
            for (Field field : fields
                    ) {
                System.out.println(field.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}

