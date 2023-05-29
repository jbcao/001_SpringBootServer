package com.src.practise.ooj_jvm.ooa_oom;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 本机直接内存溢出
 * @author caojianbang
 * @date 2020/10/21 21:03
 */
public class DirectMemoryOOM {
    private static final  int _1MB=1024*1024;

    public static void main(String[] args) {
        Field  field =  Unsafe.class.getDeclaredFields()[0];
        field.setAccessible(true);
        Unsafe unsafe  = null;
        try {
            unsafe = (Unsafe) field.get(null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        while (true) {
            unsafe.allocateMemory(_1MB);
        }

    }
}
