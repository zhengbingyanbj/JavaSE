package com.itheima.level3;
/*
1.����Ŀ�ĸ�Ŀ¼�´���student.txt�ļ�,�����ݿ���������ļ���
2.�ڰ�:com.itheima.level3��
3.����Student��
	a)����: ѧ��(id),����(name),�Ա�(sex),����(int age)
	b)�ṩ�ղ�,�вι��췽��,setters��getters����
	c)��дtoString()����
 */
public class Student {
//	ѧ��(id)
	private String id;
//	����(name)
	private String name;
//	�Ա�(sex)
	private String sex;
//	����(int age)
	private int age;
	
//	b)�ṩ�ղ�,�вι��췽��,setters��getters����
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
//	c)��дtoString()����
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
}
