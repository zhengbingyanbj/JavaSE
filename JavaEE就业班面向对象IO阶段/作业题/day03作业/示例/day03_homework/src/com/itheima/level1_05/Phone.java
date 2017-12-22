package com.itheima.level1_05;
/*
 2.定义手机类(Phone)类,实现玩游戏(PlayGame)接口
	a)属性: 品牌(brand),价格(price)
	b)功能: 
		i.特有功能: 打电话(call())
			1.输出格式: 在使用3000 元 华为手机打电话
		ii.实现接口功能: 玩游戏()
			1.输出格式: 在使用3000 元 华为手机发短信
	c)提供 空参,有参构造;setters和getters方法
 */
public class Phone implements PlayGame{
//	a)属性: 品牌(brand),价格(price)
	private String brand;
	private int price;
//	b)功能: 
//		i.特有功能: 打电话(call())
//			1.输出格式: 在使用3000 元 华为手机打电话
	public void call(){
		System.out.println("在使用"+price+" 元 "+brand+"手机打电话");
	}
//		ii.实现接口功能: 玩游戏()
//			1.输出格式: 在使用3000 元 华为手机发短信
	public void playGame(){
		System.out.println("在使用"+price+" 元 "+brand+"手机玩游戏");
	}
//	c)提供 空参,有参构造;setters和getters方法
	public Phone() {
		super();
	}
	public Phone(String brand, int price) {
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
