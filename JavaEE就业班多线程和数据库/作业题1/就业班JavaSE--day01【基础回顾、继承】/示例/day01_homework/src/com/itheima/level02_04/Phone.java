package com.itheima.level02_04;

/*
  1.�����ֻ���
	a)����: Ʒ��(brand),�۸�(price)
	b)Ҫ��:
		i.�ṩ���ι���,setXxx��getXxx����
 */
public class Phone {
//	Ʒ��
	private String brand;
//	�۸�
	private int price;
//	���ι���
	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
//	setXxx��getXxx����
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
