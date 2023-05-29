package com.src.practise.oob_reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 一、反射技术：
 * 1.是在运行状态中，
 * 2.对于任意一个类，都能知道它的属性和方法；
 * 3.对于任意一个对象，都能调用它的属性和方法，
 * 4.这种动态获取信息和动态调用对象方法的功能称为反射机制
 * 总结：动态获取信息，动态调用方法
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 二、怎么用：
 * 1.通过反射创建服务类对象
 * 2.再使用已获得的对象获取相应方法
 * 3.输入参数调用该方法
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 三、使用场景
 *
 * @author mayn
 */
public class ReflectService {
    /**
     * 服务方法
     *
     * @param name --姓名
     */
    // 1.代码自动补全快捷键：alt+/
    // 2.自动导包快捷键：ctrl+shift+o
    public void sayHello(String name) {
        System.err.println("hello" + name);
    }

    /**
     * 测试入口
     *
     * @param args
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        // 通过反射创建ReflectService对象
        Object service = Class.forName(ReflectService.class.getName()).newInstance();
        // 获取服务方法-sayHello
        Method method = service.getClass().getMethod("sayHello", String.class);
        //反射调用方法
        method.invoke(service, "zhangsan");
    }
}
