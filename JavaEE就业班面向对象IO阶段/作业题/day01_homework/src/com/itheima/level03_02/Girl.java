package com.itheima.level03_02;

/*
  	1. ����Girl��
 		1. ���ԣ� ���ƣ�name,���� age
 		2. �ṩ���ι����setXxx��getXxx����
 */
public class Girl {
//	����
	private String name;
//	����
	private int age;
	
//	���ι���
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	setXxx��getXxx����
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
