package com.src.practise.oob_abstract_class;

//定义一个抽象类
abstract class People{
private String name; 
//共有的 setter 和 getter 方法
public void setName(String name) {
	this.name = name;
}
public String getName(){
return this.name;
}  
//抽象方法
public abstract void work();
}
