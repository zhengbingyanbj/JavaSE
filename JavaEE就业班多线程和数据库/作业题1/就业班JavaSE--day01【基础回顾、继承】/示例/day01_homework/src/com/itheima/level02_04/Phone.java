package com.itheima.level02_04;

/*
  1.定义手机类
	a)属性: 品牌(brand),价格(price)
	b)要求:
		i.提供带参构造,setXxx与getXxx方法
 */
public class Phone {
//	品牌
	private String brand;
//	价格
	private int price;
//	带参构造
	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
//	setXxx与getXxx方法
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
