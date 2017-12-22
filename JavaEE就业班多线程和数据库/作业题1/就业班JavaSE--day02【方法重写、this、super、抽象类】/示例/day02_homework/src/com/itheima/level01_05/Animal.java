package com.itheima.level01_05;

/*
 1.定义动物类(Animal)
	a)成员变量 名称(name), 颜色(color)
	b)要求:成员变量私有,提供空参和有参的构造方法
 */
public class Animal {

//	名称(name)
	private String name;
//	 颜色(color)
	private String color;

//	无参构造
	public Animal() {
	}
//  带参构造
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
//	setXxx和getXxx方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	 
}
