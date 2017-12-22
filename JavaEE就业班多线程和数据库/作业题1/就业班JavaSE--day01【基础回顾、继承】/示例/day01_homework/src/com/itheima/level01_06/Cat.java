package com.itheima.level01_06;

/*
  1.定义Cat类
	a)成员变量 名称(name), 颜色(color),年龄(age)
	b)成员方法 抓老鼠(catchMouse())
	c)提供空参和带参的构造方法
	d)提供setter和getter方法
 */
public class Cat {
	//名称
	private String name;
	//颜色
	private String color;
//	年龄
	private int age;

//	成员方法
	public void catchMouse(){
		System.out.println(age+"岁的"+color+name+"猫在抓老鼠");
	}
	
//	空参构造
	public Cat() {
	}
//  带参构造(全参构造)
	public Cat(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
//	setXxx与getXxx方法
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
