package com.itheima.level02_03;
/*
 1.定义抽象类 人类(Person)
	i.成员变量(私有):  姓名(name),年龄(age)
	ii.抽象方法:  吃饭(void eat())
	iii.提供空参和带参构造方法
	iv.提供setXxx和getXxx方法
 */
public abstract class Person {
//	i.成员变量(私有):  姓名(name),年龄(age)
	private String name;
	private int age;
//	ii.抽象方法:  吃饭(void eat())
	public abstract void eat();
//	iii.提供空参和带参构造方法
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	iv.提供setXxx和getXxx方法
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
	
}
