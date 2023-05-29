package com.src.practise.oob_static_learning;

public class StaticTest {

	String name; // 声明变量name
	String sex; // 声明变量sex
	static int age;// 声明静态变量age

	// 构造方法
	public StaticTest() {
		System.out.println("通过构造方法初始化name");
		name = "tom";
	}

	// 初始化块
	{
		System.out.println("通过初始化块初始化sex");
		sex = "男";
	}

	// 静态初始化块

	/**
	 * 一、在执行类时，希望先执行类的初始化动作，可以用static定义一个静态区域
	 *
	 * 二、称为静态初始化块
	 *
	 * 三、代码被执行时，先执行静态初始化块中程序
	 *
	 * 四、并且只会执行一次
	 */
	static {
		System.out.println("通过静态初始化块初始化age");
		age = 20;
	}

	public void show() {
		System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
	}

	public static void main(String[] args) {

		// 创建对象
		StaticTest test = new StaticTest();
		// 调用对象的show方法
		test.show();

	}
}