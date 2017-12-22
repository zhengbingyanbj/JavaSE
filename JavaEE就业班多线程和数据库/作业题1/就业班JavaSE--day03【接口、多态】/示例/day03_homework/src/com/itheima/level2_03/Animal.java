package com.itheima.level2_03;
/*
1.定义动物类(Animal)
	a)属性:颜色(color),年龄(age)
	b)抽象方法: 吃(eat)
	c)提供: 空参,带参构造;setters和getters方法
 */
public abstract class Animal {
//	a)属性:颜色(color),年龄(age)
	private String color;
	private int age;
//	b)抽象方法: 吃(eat)
	public abstract void eat();
//	c)提供: 空参,带参构造;setters和getters方法
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
