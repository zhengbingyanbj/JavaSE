package com.itheima.level01_05;

/*
 1.���嶯����(Animal)
	a)��Ա���� ����(name), ��ɫ(color)
	b)Ҫ��:��Ա����˽��,�ṩ�ղκ��вεĹ��췽��
 */
public class Animal {

//	����(name)
	private String name;
//	 ��ɫ(color)
	private String color;

//	�޲ι���
	public Animal() {
	}
//  ���ι���
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
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
}
