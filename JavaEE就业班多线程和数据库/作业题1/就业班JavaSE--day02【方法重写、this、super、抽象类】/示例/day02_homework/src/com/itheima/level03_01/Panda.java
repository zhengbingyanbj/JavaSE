package com.itheima.level03_01;

/*
 3. �������è��Panda���� �̳� ���Animal����
     1. ��Ա������
 		1. ��д�����eat()����
     		�����ʽ�� ��ɫ4���ȵĴ���è�ڳ�����
 		2. ���з���: ����(climbTree)
		�����ʽ: ��ɫ4���ȵĴ���è������
     2. �ṩ�����ι��췽��
 */
public class Panda extends Animal {
//    1. ��Ա������
//		1. ��д�����eat()����
//    		�����ʽ�� ��ɫ4���ȵĴ���è�ڳ�����
	public void eat() {
		System.out.println(getColor()+getNumOfLegs()+"���ȵĴ���è�ڳ�����");
	}
//		2. ���з���: ����(climbTree)
//		�����ʽ: ��ɫ4���ȵĴ���è������
	public void climbTree(){
		System.out.println(getColor()+getNumOfLegs()+"���ȵĴ���è������");
	}
//    2. �ṩ�����ι��췽��
	public Panda() {
		super();
	}

	public Panda(String color, int numOfLegs) {
		super(color, numOfLegs);
	}
	
}
