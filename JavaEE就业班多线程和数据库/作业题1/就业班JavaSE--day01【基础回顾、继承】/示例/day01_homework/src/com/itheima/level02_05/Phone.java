package com.itheima.level02_05;

/*
 1. �����ֻ���
	a)��Ա����
		i.Ʒ�� brand
		ii.�۸� price
	b)��Ա����
		i.��绰  public void call(String name)
	c)Ҫ��
		i.�ṩ�޲κʹ��ι���
		ii.�ṩsetXxx��getXxx����
 */
public class Phone {
//	Ʒ�� brand
	private String brand;
//	�۸� price
	private int price;
//	��绰  public void call(String name)
	public void call(String name){
		 System.out.println("��"+name+"��绰");
	 }
//	�޲κʹ��ι���
	public Phone() {
	}
	
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
