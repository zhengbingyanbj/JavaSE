package com.itheima.level2_01;
/*
 4.����ƽ��(Pad)��,ʵ��PlayGame�ӿ�
	a)����:Ʒ��(brand),�۸�(price)
	b)��Ա����
		i.ʵ��playGame()����
			1.�����ʽ: ��ʹ��2000Ԫ��iPadƽ������Ϸ
		ii.���з���: ������(listenMusic)
			1.�����ʽ: ��ʹ��2000Ԫ��iPadƽ����������
	c)�ṩ�ղ�,�вι���,setters��getters����
 */
public class Pad implements PlayGame {
//	a)����:Ʒ��(brand),�۸�(price)
	private String brand;
	private int price;
//	b)��Ա����
//		i.ʵ��playGame()����
//			1.�����ʽ: ��ʹ��2000Ԫ��iPadƽ������Ϸ
	public void playGame() {
		System.out.println("��ʹ��"+price+"Ԫ��"+brand+"ƽ������Ϸ");
	}
//		ii.���з���: ������(listenMusic)
//			1.�����ʽ: ��ʹ��2000Ԫ��iPadƽ��������
	public void listenMusic(){
		System.out.println("��ʹ��"+price+"Ԫ��"+brand+"ƽ��������");
	}
//	c)�ṩ�ղ�,�вι���,setters��getters����
	public Pad() {
		super();
	}
	
	public Pad(String brand, int price) {
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
