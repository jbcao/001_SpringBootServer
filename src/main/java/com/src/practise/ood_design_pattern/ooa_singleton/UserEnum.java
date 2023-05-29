package com.src.practise.ood_design_pattern.ooa_singleton;

/**
 * 枚举类型
 * 这个方式比较好
 * 天生保障jvm是单例 都是static final的
 * 饿汉 懒汉 静态方式可以被反射攻击，但枚举方式可防止反射攻击
 */
enum UserEnum {

    //枚举需要注释，否则会报错
    //每一个初始化一次，一共4次
    //
    HTTP_200(200, "请求成功"), HTTP_500(500, "服务失败"), HTTP_300(300, "重定向"), HTTP_400(400, "请求失败");
    private Integer code;
    private String name;

    UserEnum(Integer code, String name) {
        //永远执行一次，保证单例
        System.out.println("枚举初始化。。。。");
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(UserEnum.HTTP_200.getCode());


    }
}

