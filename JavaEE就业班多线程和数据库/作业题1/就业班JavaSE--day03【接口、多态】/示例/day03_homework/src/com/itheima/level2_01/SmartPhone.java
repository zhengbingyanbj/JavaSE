package com.itheima.level2_01;
/*
 3.���������ֻ�(SmartPhone)��̳��ֻ���(Phone),ʵ������Ϸ�ӿ�(PlayGame())
	a)ʵ��playGame()����
		i.��ʹ��3000Ԫ�� ��Ϊ �ֻ�����Ϸ
	b)�ṩ�ղ�,�вι���
 */
public class SmartPhone extends Phone implements PlayGame {
//a)ʵ��playGame()����
//		i.��ʹ��5000Ԫ��iPhone�ֻ�����Ϸ
	public void playGame() {
		System.out.println("��ʹ��"+getPrice()+"Ԫ��"+getBrand()+"�ֻ�����Ϸ");
	}
//b)�ṩ�ղ�,�вι���
	public SmartPhone() {
		super();
	}
	public SmartPhone(String brand, int price) {
		super(brand, price);
	}
}
