package com.itheima.level02_05;

/*
 1. 定义手机类
	a)成员变量
		i.品牌 brand
		ii.价格 price
	b)成员方法
		i.打电话  public void call(String name)
	c)要求
		i.提供无参和带参构造
		ii.提供setXxx和getXxx方法
 */
public class Phone {
//	品牌 brand
	private String brand;
//	价格 price
	private int price;
//	打电话  public void call(String name)
	public void call(String name){
		 System.out.println("给"+name+"打电话");
	 }
//	无参和带参构造
	public Phone() {
	}
	
	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
//	setXxx和getXxx方法
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
