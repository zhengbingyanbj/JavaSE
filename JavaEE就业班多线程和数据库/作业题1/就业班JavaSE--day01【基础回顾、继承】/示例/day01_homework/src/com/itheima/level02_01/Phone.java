package com.itheima.level02_01;
/*
  1.定义手机类(Phone)
	i.成员变量:  品牌(brand)
	ii.成员方法:  玩游戏(void playGame())
	iii.提供空参和带参构造方法
	iv.提供setXxx和getXxx方法
 */
public class Phone {
//	品牌
	private String brand;
//	成员方法
	public void playGame(){
		System.out.println("玩游戏");
	}
//	空参构造
	public Phone() {
	}
//	有参构造
	public Phone(String brand) {
		this.brand = brand;
	}
//	setXxx与getXxx方法
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
