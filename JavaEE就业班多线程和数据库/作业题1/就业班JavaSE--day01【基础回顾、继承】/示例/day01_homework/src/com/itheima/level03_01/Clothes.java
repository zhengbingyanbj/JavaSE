package com.itheima.level03_01;

/*
   1. 定义衣服（Clothes）类
  	 1. 属性： 颜色（color），品牌(brand)
  	 2. 提供带参构造和setXxx和getXxx方法
 */
public class Clothes {
//	颜色（color）
	private String color;
//	品牌(brand)
	private String brand;
//	带参构造
	public Clothes(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
//  setXxx和getXxx方法
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
