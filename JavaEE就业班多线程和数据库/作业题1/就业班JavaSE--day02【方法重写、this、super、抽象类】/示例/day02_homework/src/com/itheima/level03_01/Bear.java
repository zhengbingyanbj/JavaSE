package com.itheima.level03_01;

/*
 2. ���山���ܣ�Bear���� �̳� ���Animal����
     1. ��Ա������
 		1. ��д�����eat()����
     		�����ʽ�� ��ɫ4���ȵı������ڳԷ���
 		2. ���з���: ץ��(catchFish)
			�����ʽ: ��ɫ4���ȵı�������ץ��
     2. �ṩ�����ι��췽��
 */
public class Bear extends Animal {
	
//    1. ��Ա������
// 		1. ��д�����eat()����
//     		�����ʽ�� ��ɫ4���ȵı������ڳԷ���
	public void eat() {
		System.out.println(getColor()+getNumOfLegs()+"�ȵı������ڳԷ���");
	}
// 		2. ���з���: ץ��(catchFish)
//			�����ʽ: ��ɫ4���ȵı�������ץ��
	public void catchFish(){
		System.out.println(getColor()+getNumOfLegs()+"�ȵı�������ץ��");
	}
	
//  2. �ṩ�����ι��췽��
	public Bear() {
		super();
	}
	public Bear(String color, int numOfLegs) {
		super(color, numOfLegs);
	}
	
}
