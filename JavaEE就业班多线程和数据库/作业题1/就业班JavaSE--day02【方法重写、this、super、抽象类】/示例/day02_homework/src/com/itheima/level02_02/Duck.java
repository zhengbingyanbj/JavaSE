package com.itheima.level02_02;
/*
 3.����Ѽ����(Duck),�̳�Poultry��
	i.��Ա����:
		1. ��д����� eat()����
			a)���: 1��ĺ�ɫ��Ѽ���ڳ���
		2. ���з���: swim()  ��Ӿ����
			a)���:  1��ĺ�ɫ��Ѽ������Ӿ
		ii.�ṩ�ղκʹ��ι��췽��
 */
public class Duck extends Poultry {
	
//	i.��Ա����:
//		1. ��д����� eat()����
//		a)���: 1��ĺ�ɫ��Ѽ���ڳ���
	public void eat() {
		System.out.println(getAge()+"��"+getColor()+"��Ѽ���ڳ���");
	}
//		2. ���з���: swim()  ��Ӿ����
//			a)���:  1��ĺ�ɫ��Ѽ������Ӿ
	public void swim(){
		System.out.println(getAge()+"��"+getColor()+"��Ѽ������Ӿ");
	}
//		ii.�ṩ�ղκʹ��ι��췽��
	public Duck() {
		super();
	}
	
	public Duck(String color, int age) {
		super(color, age);
	}
	
}
