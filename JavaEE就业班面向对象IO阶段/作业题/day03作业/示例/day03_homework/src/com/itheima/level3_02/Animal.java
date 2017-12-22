package com.itheima.level3_02;
/*
 1.�����������Animal
	a)����: ��ɫ(Color) ,����(age)
	b)���󷽷�: ��(eat)
	c)�ṩ:�ղ�,�вι��췽��,setters��getters ����
 */
public abstract class Animal {
//	a)����: ��ɫ(Color) ,����(age)
	private String color;
	private int age;
//	b)���󷽷�: ��(eat)
	public abstract void eat();
//	c)�ṩ:�ղ�,�вι��췽��,setters��getters ����
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
