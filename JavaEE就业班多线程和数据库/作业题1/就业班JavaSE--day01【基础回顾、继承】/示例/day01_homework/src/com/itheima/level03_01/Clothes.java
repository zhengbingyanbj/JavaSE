package com.itheima.level03_01;

/*
   1. �����·���Clothes����
  	 1. ���ԣ� ��ɫ��color����Ʒ��(brand)
  	 2. �ṩ���ι����setXxx��getXxx����
 */
public class Clothes {
//	��ɫ��color��
	private String color;
//	Ʒ��(brand)
	private String brand;
//	���ι���
	public Clothes(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
//  setXxx��getXxx����
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
