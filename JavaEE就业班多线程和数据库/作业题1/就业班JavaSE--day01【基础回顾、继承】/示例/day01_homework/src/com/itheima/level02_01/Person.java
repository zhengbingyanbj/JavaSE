package com.itheima.level02_01;
/*
   2.��������(Person)
	i.��Ա����: ����(name),����(age)
	ii.��Ա����: ʹ���ֻ�����Ϸ (usePhone(Phone p))
	iii.�ṩ�ղκʹ��ι��췽��
	iv.�ṩsetXxx��getXxx����
 */
public class Person {
//	����
	private String name;
//	����
	private int age;
	
//	��Ա����
	public void usePhone(Phone p){
		System.out.print(age+"���"+name+"��ʹ��"+p.getBrand()+"���ֻ�");
		p.playGame();
	}
	
//	�޲ι���
	public Person() {
	}
//	���ι���
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
