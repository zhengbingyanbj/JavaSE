package com.itheima.level1_05;

/*
 3.�������(Computer)��ʵ������Ϸ�ӿ�(PlayGame())
	a)����: Ʒ��(brand)�ͼ۸�(price)
	b)����:
		i.ʵ��playGame()����
			1.�����ʽ: ʹ��6000Ԫ�������������Ϸ
		ii.���й���: ����(coding)
			1.�����ʽ: ʹ��6000Ԫ��������Կ���JavaEEӦ��
	c)�ṩ�ղ�,�вι���,setters��getters
 */
public class Computer implements PlayGame {
//	a)����: Ʒ��(brand)�ͼ۸�(price)
	private String brand;
	private int price;
//	b)����:
//		i.ʵ��playGame()����
//			1.�����ʽ: ʹ��6000Ԫ�������������Ϸ
	public void playGame(){
		System.out.println("ʹ��"+price+"Ԫ��"+brand+"��������Ϸ");
	}
//		ii.���й���: ����(coding)
//			1.�����ʽ: ʹ��6000Ԫ��������Կ���JavaEEӦ��
	public void coding(){
		System.out.println("ʹ��"+price+"Ԫ��"+brand+"���Կ���JavaEEӦ��");
	}
//	c)�ṩ�ղ�,�вι���,setters��getters
	public Computer() {
		super();
	}
	
	public Computer(String brand, int price) {
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
