package com.itheima.level1_06;

/*
 3.�������ܰµϳ���(SmartAudi) �̳�Audiʵ��Smart�ӿ�
	a)��Ա����
	i.ʵ��automaticParking����
		1.���:���ܰµϳ����Զ�����
	ii.ʵ��automaticDrive����
		1.���:���ܰµϳ������˼�ʻ
 */
public class SmartAudi extends Audi implements Smart {

//	i.ʵ��automaticParking����
	public void automaticParking() {
		System.out.println("���ܰµϳ����Զ�����");
	}
//  ii.ʵ��automaticDrive����
	public void automaticDrive() {
	   System.out.println("���ܰµϳ����Զ���ʻ");
	}
}
