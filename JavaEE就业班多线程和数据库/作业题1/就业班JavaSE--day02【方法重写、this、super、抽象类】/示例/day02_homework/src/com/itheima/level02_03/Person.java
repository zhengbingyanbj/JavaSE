package com.itheima.level02_03;
/*
 1.��������� ����(Person)
	i.��Ա����(˽��):  ����(name),����(age)
	ii.���󷽷�:  �Է�(void eat())
	iii.�ṩ�ղκʹ��ι��췽��
	iv.�ṩsetXxx��getXxx����
 */
public abstract class Person {
//	i.��Ա����(˽��):  ����(name),����(age)
	private String name;
	private int age;
//	ii.���󷽷�:  �Է�(void eat())
	public abstract void eat();
//	iii.�ṩ�ղκʹ��ι��췽��
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	iv.�ṩsetXxx��getXxx����
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
