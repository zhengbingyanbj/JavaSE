package com.itheima.level01_06;

/*
  1.����Cat��
	a)��Ա���� ����(name), ��ɫ(color),����(age)
	b)��Ա���� ץ����(catchMouse())
	c)�ṩ�ղκʹ��εĹ��췽��
	d)�ṩsetter��getter����
 */
public class Cat {
	//����
	private String name;
	//��ɫ
	private String color;
//	����
	private int age;

//	��Ա����
	public void catchMouse(){
		System.out.println(age+"���"+color+name+"è��ץ����");
	}
	
//	�ղι���
	public Cat() {
	}
//  ���ι���(ȫ�ι���)
	public Cat(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
//	setXxx��getXxx����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
