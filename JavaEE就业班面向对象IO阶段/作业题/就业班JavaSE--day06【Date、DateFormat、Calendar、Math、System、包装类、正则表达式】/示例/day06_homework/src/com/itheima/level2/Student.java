package com.itheima.level2;
/*
1.��com.itheima.level2����
2.����Student��
	a)����: ����(name),�Ա�(sex),����(int age),QQ����(qq)
	b)�ṩ�ղ�,�вι��췽���Լ�setters��getters����
	c)��дtoString()����,��������ֵ
 */
public class Student {
//	 ����(name)
	private String name;
//	  �Ա�(sex)
	private String sex;
//	 ����(int age)
	private int age;
//	 QQ����(qq)
	private String qq;
	
//	b)�ṩ�ղ�,�вι��췽���Լ�setters��getters����
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
//	c)��дtoString()����,��������ֵ
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + ", qq=" + qq + "]";
	}
}
