package com.itheima.level3_02;
/*
 1.定义抽象动物类Animal
	a)属性: 颜色(Color) ,年龄(age)
	b)抽象方法: 吃(eat)
	c)提供:空参,有参构造方法,setters和getters 方法
 */
public abstract class Animal {
//	a)属性: 颜色(Color) ,年龄(age)
	private String color;
	private int age;
//	b)抽象方法: 吃(eat)
	public abstract void eat();
//	c)提供:空参,有参构造方法,setters和getters 方法
	public Animal() {
		super();
	}
	public Animal(String color, int age) {
		super();
		this.color = color;
		this.age = age;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
