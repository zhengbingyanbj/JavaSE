package com.itheima.level1_10;

public class Student {
//	学校
	public static String school  = "清华大学";
//	姓名
	private String name;
//	年龄
	private int age;

//	构造方法
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
// setters和getters方法
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
