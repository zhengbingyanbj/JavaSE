package com.itheima.level2;
/*
1.在com.itheima.level2包中
2.创建Student类
	a)属性: 姓名(name),性别(sex),年龄(int age),QQ号码(qq)
	b)提供空参,有参构造方法以及setters与getters方法
	c)重写toString()方法,返回属性值
 */
public class Student {
//	 姓名(name)
	private String name;
//	  性别(sex)
	private String sex;
//	 年龄(int age)
	private int age;
//	 QQ号码(qq)
	private String qq;
	
//	b)提供空参,有参构造方法以及setters与getters方法
	public Student() {
		super();
	}
	public Student(String name, String sex, int age, String qq) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.qq = qq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}	
//	c)重写toString()方法,返回属性值
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + ", qq=" + qq + "]";
	}
}
