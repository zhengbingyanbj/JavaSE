package com.itheima.level03_02;

/*
 2.����С������(Car),�̳�Vehicle��
	a)��Ա����
		i.��д�����run����
			1.�����ʽ�� 4�����ӵİ�ɫ������������
		ii.���з���: ���� (addGasoline() ))
			1.�ڷ����е������ʽΪ: 4�����ӵİ�ɫ�����ڼ���
	b) Ҫ���ṩ�ղι���ʹ��ι���
 */
public class Car extends Vehicle{
//a)��Ա����
//	i.��д�����run����
//		1.�����ʽ�� 4�����ӵİ�ɫ������������
	public void run(){
		System.out.println(getWheel()+"������"+getColor()+"������������");
	}
//	ii.���з���: ���� (addGasoline())
//		1.�ڷ����е������ʽΪ: 4�����ӵİ�ɫС�����ڼ���
	public void addGasoline(){
		System.out.println(getWheel()+"������"+getColor()+"�������ڼ���");
	}
//b) Ҫ���ṩ�ղι���ʹ��ι���
	public Car() {
		super();
	}
	public Car(int wheel, String color) {
		super(wheel, color);
	}
	
}
