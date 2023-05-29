package com.src.practise.ood_design_pattern.ook_proxy.dynamic.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author caojianbang
 * @date 2021/9/2 23:23
 * <p>
 * 反射
 */
public class UserEntity {
    private String userName;

    public UserEntity() {
        System.out.println("对象初始化。。。。");
        //throw new RuntimeException();
    }

    public UserEntity(String userName) {
        System.out.println(userName);
        this.userName = userName;
    }

    //构造函数中，如果发生异常，对象会创建成功吗？
    //不会
    public static void main(String[] args) {
        //1.初始化操作，无参构造函数
        UserEntity userEntity = new UserEntity();
        userEntity.userName = "曹建邦";
        System.out.println(userEntity.userName);
        //2.通过反射创建对象
        //类的完整路径
        try {
            //Class是该类的class文件
            Class<?> aClass = Class.forName("com.src.practise.ood_design_pattern.ook_proxy.dynamic.reflection.UserEntity");
            //3.使用反射机制创建对象
            UserEntity userEntity1 = (UserEntity) aClass.newInstance();
            userEntity1.userName = "反射对象";
            System.out.println(userEntity1.userName);
            /**
             * 4.应用场景
             *   jdbc连接,加载驱动
             *   spring的IOC底层是使用反射机制+DOM4J
             *   Hibernate，mybatis
             *   zookeeper
             */
            //5.通过反射获取类信息,方法信息
            /*    Method[] methods = aClass.getMethods();
            for (Method method:methods
                 ) {
                System.out.println(method.getName());
            }*/
            //通过反射获取类的声明的属性,
            Field[] fields = aClass.getDeclaredFields();
            for (Field field : fields
                    ) {
                System.out.println(field.getName());
            }
            //通过反射获取构造函数
            Constructor<?> constructor = aClass.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);
            UserEntity userEntity2 = (UserEntity) constructor.newInstance("每特教育");
            System.out.println(userEntity2.userName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
