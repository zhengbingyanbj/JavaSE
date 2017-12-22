package com.itheima.level1_05;
/*
 2.�����ֻ���(Phone)��,ʵ������Ϸ(PlayGame)�ӿ�
	a)����: Ʒ��(brand),�۸�(price)
	b)����: 
		i.���й���: ��绰(call())
			1.�����ʽ: ��ʹ��3000 Ԫ ��Ϊ�ֻ���绰
		ii.ʵ�ֽӿڹ���: ����Ϸ()
			1.�����ʽ: ��ʹ��3000 Ԫ ��Ϊ�ֻ�������
	c)�ṩ �ղ�,�вι���;setters��getters����
 */
public class Phone implements PlayGame{
//	a)����: Ʒ��(brand),�۸�(price)
	private String brand;
	private int price;
//	b)����: 
//		i.���й���: ��绰(call())
//			1.�����ʽ: ��ʹ��3000 Ԫ ��Ϊ�ֻ���绰
	public void call(){
		System.out.println("��ʹ��"+price+" Ԫ "+brand+"�ֻ���绰");
	}
//		ii.ʵ�ֽӿڹ���: ����Ϸ()
//			1.�����ʽ: ��ʹ��3000 Ԫ ��Ϊ�ֻ�������
	public void playGame(){
		System.out.println("��ʹ��"+price+" Ԫ "+brand+"�ֻ�����Ϸ");
	}
//	c)�ṩ �ղ�,�вι���;setters��getters����
	public Phone() {
		super();
	}
	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
