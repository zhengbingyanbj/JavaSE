package com.itheima.level03_02;
/*
 3.����綯����(ElectricBicycle),�̳�Vehicle��
	a)��Ա����
		i.��д�����run����
			1.�����ʽ�� 2�����ӵĺ�ɫ�ĵ綯��������
		ii.���г�Ա����: ��� (charge())
			1.�ڷ����е������ʽΪ: 2�����ӵĺ�ɫ�綯���г��ڳ��
	b) Ҫ���ṩ�ṩ�ղι���ʹ��ι���
 */
public class ElectricBicycle extends Vehicle{
//	a)��Ա����
//		i.��д�����run����
//			1.�����ʽ�� 2�����ӵĺ�ɫ�ĵ綯��������
	public void run() {
		System.out.println(getWheel()+"�����ӵ�"+getColor()+"�ĵ綯��������");
	}
//	ii.���г�Ա����: ��� (charge())
//		1.�ڷ����е������ʽΪ: 2�����ӵĺ�ɫ�綯���г��ڳ��
	public void charge(){
		System.out.println(getWheel()+"�����ӵ�"+getColor()+"�ĵ綯���ڳ��");
	}
//  b) Ҫ���ṩ�ṩ�ղι���ʹ��ι���
	public ElectricBicycle() {
		super();
	}
	public ElectricBicycle(int wheel, String color) {
		super(wheel, color);
	}
	
}
