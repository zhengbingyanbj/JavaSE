package com.itheima.level02_06;

/*
 
1.定义衣服类(Clothes)
	a)成员变量:
		i.颜色(color)
		ii.品牌(brand)
	b)提供 无参,带参构造和setXxx和getXxx方法
 */
public class Clothes {
//	a)成员变量:
//		i.颜色(color)
	private String color;
//		ii.品牌(brand)
	private String brand;
	
//	b)提供 无参,带参构造和setXxx和getXxx方法
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
