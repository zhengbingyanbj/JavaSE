package com.itheima.level02_06;

/*
 
1.�����·���(Clothes)
	a)��Ա����:
		i.��ɫ(color)
		ii.Ʒ��(brand)
	b)�ṩ �޲�,���ι����setXxx��getXxx����
 */
public class Clothes {
//	a)��Ա����:
//		i.��ɫ(color)
	private String color;
//		ii.Ʒ��(brand)
	private String brand;
	
//	b)�ṩ �޲�,���ι����setXxx��getXxx����
	public Clothes() {
		super();
	}
	public Clothes(String color, String brand) {
		super();
		this.color = color;
		this.brand = brand;
	}
	
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
