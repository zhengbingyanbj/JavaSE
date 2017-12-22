package com.itheima.level03_02;

/*
  	1. 定义Girl类
 		1. 属性： 名称：name,年龄 age
 		2. 提供带参构造和setXxx和getXxx方法
 */
public class Girl {
//	名称
	private String name;
//	年龄
	private int age;
	
//	带参构造
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	setXxx和getXxx方法
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
