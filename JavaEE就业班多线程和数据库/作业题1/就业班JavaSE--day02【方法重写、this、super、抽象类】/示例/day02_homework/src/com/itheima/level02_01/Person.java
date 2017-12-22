package com.itheima.level02_01;
/*
 1.定义Person类
	i.成员变量(私有):  名称(name),年龄(age)
	ii.成员方法:  吃饭(void eat())
		1.输出格式:  30岁的王小平在吃饭
	iii.提供空参和带参构造方法
	iv.提供setXxx和getXxx方法
 */
public class Person {
// 名称(name)
	private String name;
//	年龄(age)
	private int age;
	
//	饭(void eat())
	public void eat(){
		System.out.println(age+"岁的"+name+"在吃饭");
	}

//	空参构造
	public Person() {
	}
//  带参构造
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
// setXxx和getXxx方法
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
