package com.src.practise.oob_implement;

public class Drawing implements DrawTest {
	/**
	 *  实现接口中的方法并进行测试
	 * 	即使不去实现接口，单独去创建一个这样的类，任然可以实现这样的功能与调用，
	 * 	那么，创建接口，并进行实现的意义何在？是不是多此一举？
	 * @param args
	 */
	//运行main方法：Ctrl+Shift+F10
	public static void main(String[] args) {
		Drawing drawTest = new Drawing();
		drawTest.draw();
	}
	@Override
	public void draw() {
		System.out.print("画一个图形");
	}

}
