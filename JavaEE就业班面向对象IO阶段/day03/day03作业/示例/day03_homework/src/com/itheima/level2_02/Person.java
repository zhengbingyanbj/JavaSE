package com.itheima.level2_02;
/*
 1.�����������(Person)
	a)����: ����(name),����(age)
	b)���󷽷�: eat()
	c)�ṩ:�޲�,�вι��췽����setters��getters����
 */
public abstract class Person {
//	a)����: ����(name),����(age)
	private String name;
	private int age;
//	b)���󷽷�: eat()
	public abstract void eat();
//	c)�ṩ:�޲�,�вι��췽����setters��getters����
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
