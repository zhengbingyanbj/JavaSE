package com.itheima.level02_06;

/*
 2.������(Person)
	a)��Ա����
		i.���� name
		ii.���� age
		iii.��� height
	b)��Ա����
	i.���󷽷�  void say(String content)
	c)Ҫ��
		i.�ṩ�޲κʹ��ι���
		ii.�ṩsetXxx��getXxx����
 */
public abstract class Person {
//a)��Ա����
//	i.���� name
	private String name;
//	ii.���� age
	private int age;
//	iii.��� height
	private double height;
//b)��Ա����
//	i.���󷽷�  void say(String content)
	public abstract void say(String content);
//c)Ҫ��
//	i.�ṩ�޲κʹ��ι���
	public Person() {
		super();
	}
	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
//	ii.�ṩsetXxx��getXxx����
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
