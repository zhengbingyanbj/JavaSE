package com.itheima.level1_05;

/*
 3.定义电脑(Computer)类实现玩游戏接口(PlayGame())
	a)属性: 品牌(brand)和价格(price)
	b)功能:
		i.实现playGame()方法
			1.输出格式: 使用6000元的雷神电脑玩游戏
		ii.特有功能: 编码(coding)
			1.输出格式: 使用6000元的雷神电脑开发JavaEE应用
	c)提供空参,有参构造,setters与getters
 */
public class Computer implements PlayGame {
//	a)属性: 品牌(brand)和价格(price)
	private String brand;
	private int price;
//	b)功能:
//		i.实现playGame()方法
//			1.输出格式: 使用6000元的雷神电脑玩游戏
	public void playGame(){
		System.out.println("使用"+price+"元的"+brand+"电脑玩游戏");
	}
//		ii.特有功能: 编码(coding)
//			1.输出格式: 使用6000元的雷神电脑开发JavaEE应用
	public void coding(){
		System.out.println("使用"+price+"元的"+brand+"电脑开发JavaEE应用");
	}
//	c)提供空参,有参构造,setters与getters
	public Computer() {
		super();
	}
	
	public Computer(String brand, int price) {
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
