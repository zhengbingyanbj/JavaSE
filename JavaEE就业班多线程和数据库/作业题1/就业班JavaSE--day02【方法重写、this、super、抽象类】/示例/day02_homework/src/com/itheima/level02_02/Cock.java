package com.itheima.level02_02;
/*
 2.���幫����(Cock),�̳�Poultry��
	i.��Ա����:
		1. ��д����� eat()����
			a)���:  2��ĺ�ɫ����������
		2. ���з���:  ����(crow)
			a)���:  2��ĺ�ɫ�����ڴ���
	ii.�ṩ�ղκʹ��ι��췽��
 */
public class Cock extends Poultry{
//	i.��Ա����:
//		1. ��д����� eat()����
//			a)���:  2��ĺ�ɫ����������
	public void eat() {
		System.out.println(getAge()+"���"+getColor()+"����������");
	}
//		2. ���з���:  ����(crow)
//			a)���:  2��ĺ�ɫ�����ڴ���
	public void crow(){
		System.out.println(getAge()+"���"+getColor()+"�����ڴ���");
	}
//	ii.�ṩ�ղκʹ��ι��췽��
	public Cock() {
		super();
	}
	public Cock(String color, int age) {
		super(color, age);
	}
	
}
