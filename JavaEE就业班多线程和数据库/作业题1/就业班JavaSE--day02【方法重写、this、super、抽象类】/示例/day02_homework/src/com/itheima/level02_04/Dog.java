package com.itheima.level02_04;
/*
2.���幷��(Dog),�̳�Animal��
	i.��Ա����:
		1.��д����� eat()����
			a)�����ʽ::  4���Ⱥ�ɫ�Ĺ��ڿй�ͷ
		2. ���з���:  ����(lookHome)
			a)�����ʽ::  4���Ⱥ�ɫ�Ĺ��ڿ���.
	ii.�ṩ�ղκʹ��ι��췽��
 */
public class Dog extends Animal {
//	i.��Ա����:
//		1.��д����� eat()����
//			a)�����ʽ::  4���Ⱥ�ɫ�Ĺ��ڿй�ͷ
	public void eat() {
		System.out.println(getNumOfLegs()+"����"+getColor()+"�Ĺ��ڿй�ͷ");
	}
//		2. ���з���:  ����(lookHome)
//			a)�����ʽ::  4���Ⱥ�ɫ�Ĺ��ڿ���.
	public void lookHome(){
		System.out.println(getNumOfLegs()+"����"+getColor()+"�Ĺ��ڿ���");
	}
//	ii.�ṩ�ղκʹ��ι��췽��
	public Dog() {
		super();
	}
	public Dog(String color, int numOfLegs) {
		super(color, numOfLegs);
	}
}
