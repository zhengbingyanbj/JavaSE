package com.itheima.level1_10;

public class Student {
//	ѧУ
	public static String school  = "�廪��ѧ";
//	����
	private String name;
//	����
	private int age;

//	���췽��
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
// setters��getters����
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
