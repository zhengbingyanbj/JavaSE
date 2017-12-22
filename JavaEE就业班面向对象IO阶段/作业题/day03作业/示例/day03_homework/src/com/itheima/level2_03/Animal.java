package com.itheima.level2_03;
/*
1.���嶯����(Animal)
	a)����:��ɫ(color),����(age)
	b)���󷽷�: ��(eat)
	c)�ṩ: �ղ�,���ι���;setters��getters����
 */
public abstract class Animal {
//	a)����:��ɫ(color),����(age)
	private String color;
	private int age;
//	b)���󷽷�: ��(eat)
	public abstract void eat();
//	c)�ṩ: �ղ�,���ι���;setters��getters����
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
