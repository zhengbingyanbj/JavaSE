package com.itheima.level3;
/*
1.在项目的根目录下创建student.txt文件,把内容拷贝到这个文件中
2.在包:com.itheima.level3中
3.创建Student类
	a)属性: 学号(id),姓名(name),性别(sex),年龄(int age)
	b)提供空参,有参构造方法,setters和getters方法
	c)重写toString()方法
 */
public class Student {
//	学号(id)
	private String id;
//	姓名(name)
	private String name;
//	性别(sex)
	private String sex;
//	年龄(int age)
	private int age;
	
//	b)提供空参,有参构造方法,setters和getters方法
	public Student() {
		super();
	}
	public Student(String id, String name, String sex, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
//	c)重写toString()方法
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
}
