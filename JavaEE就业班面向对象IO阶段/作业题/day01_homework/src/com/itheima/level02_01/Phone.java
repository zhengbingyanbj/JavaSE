package com.itheima.level02_01;
/*
  1.�����ֻ���(Phone)
	i.��Ա����:  Ʒ��(brand)
	ii.��Ա����:  ����Ϸ(void playGame())
	iii.�ṩ�ղκʹ��ι��췽��
	iv.�ṩsetXxx��getXxx����
 */
public class Phone {
//	Ʒ��
	private String brand;
//	��Ա����
	public void playGame(){
		System.out.println("����Ϸ");
	}
//	�ղι���
	public Phone() {
	}
//	�вι���
	public Phone(String brand) {
		this.brand = brand;
	}
//	setXxx��getXxx����
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
