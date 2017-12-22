package com.itheima.level02_06;

/*
 2.抽象类(Person)
	a)成员变量
		i.姓名 name
		ii.年龄 age
		iii.身高 height
	b)成员方法
	i.抽象方法  void say(String content)
	c)要求
		i.提供无参和带参构造
		ii.提供setXxx和getXxx方法
 */
public abstract class Person {
//a)成员变量
//	i.姓名 name
	private String name;
//	ii.年龄 age
	private int age;
//	iii.身高 height
	private double height;
//b)成员方法
//	i.抽象方法  void say(String content)
	public abstract void say(String content);
//c)要求
//	i.提供无参和带参构造
	public Person() {
		super();
	}
	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
//	ii.提供setXxx和getXxx方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
