package com.itheima.level02_01;
/*
 1.����Person��
	i.��Ա����(˽��):  ����(name),����(age)
	ii.��Ա����:  �Է�(void eat())
		1.�����ʽ:  30�����Сƽ�ڳԷ�
	iii.�ṩ�ղκʹ��ι��췽��
	iv.�ṩsetXxx��getXxx����
 */
public class Person {
// ����(name)
	private String name;
//	����(age)
	private int age;
	
//	��(void eat())
	public void eat(){
		System.out.println(age+"���"+name+"�ڳԷ�");
	}

//	�ղι���
	public Person() {
	}
//  ���ι���
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
// setXxx��getXxx����
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
