package com.itheima.level03_01;

/*
 1. ���嶯���ࣨAnimal����
  	1. ���ԣ� ��ɫ��color�����ȵĸ���(numOfLegs)
	2.��Ա����: eat()
		a)�����ʽ: ��ɫ4���ȵĶ����ڳԶ���
	3. �ṩ���ι����setXxx��getXxx����
 */
public class Animal {
//  1. ���ԣ� ��ɫ��color�����ȵĸ���(numOfLegs)
	private String color;
	private int numOfLegs;
//	2.��Ա����: eat()
//		a)�����ʽ: ��ɫ4���ȵĶ����ڳԶ���
	public void eat(){
		System.out.println(color+numOfLegs+"���ȵĶ����ڳԶ���");
	}
//	3. �ṩ���ι����setXxx��getXxx����
	public Animal() {
		super();
	}
	public Animal(String color, int numOfLegs) {
		super();
		this.color = color;
		this.numOfLegs = numOfLegs;
	}
	
	
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
