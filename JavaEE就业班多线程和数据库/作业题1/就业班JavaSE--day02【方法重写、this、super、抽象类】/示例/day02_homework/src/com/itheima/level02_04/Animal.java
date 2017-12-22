package com.itheima.level02_04;

/*
 1.��������� ������(Animal)
	i.��Ա����(˽��):  ��ɫ(color),�ȵĸ���(numOfLegs)
	ii.���󷽷�:  �Է�(void eat())
	iii.�ṩ�ղκʹ��ι��췽��
	iv.�ṩsetXxx��getXxx����
 */
public abstract class Animal {
//	i.��Ա����(˽��):  ��ɫ(color),�ȵĸ���(numOfLegs)
	private String color;
	private int numOfLegs;
//	ii.���󷽷�:  �Է�(void eat())
	public abstract void eat();
//	iii.�ṩ�ղκʹ��ι��췽��
	public Animal() {
	}
	
	public Animal(String color, int numOfLegs) {
		this.color = color;
		this.numOfLegs = numOfLegs;
	}
//	iv.�ṩsetXxx��getXxx����
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	
}
