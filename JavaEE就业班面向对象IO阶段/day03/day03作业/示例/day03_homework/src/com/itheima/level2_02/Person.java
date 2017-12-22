package com.itheima.level2_02;
/*
 1.定义抽象人类(Person)
	a)属性: 姓名(name),年龄(age)
	b)抽象方法: eat()
	c)提供:无参,有参构造方法和setters和getters方法
 */
public abstract class Person {
//	a)属性: 姓名(name),年龄(age)
	private String name;
	private int age;
//	b)抽象方法: eat()
	public abstract void eat();
//	c)提供:无参,有参构造方法和setters和getters方法
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
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
