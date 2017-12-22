package com.itheima.level2_01;
/*
 3.定义智能手机(SmartPhone)类继承手机类(Phone),实现玩游戏接口(PlayGame())
	a)实现playGame()方法
		i.在使用3000元的 华为 手机玩游戏
	b)提供空参,有参构造
 */
public class SmartPhone extends Phone implements PlayGame {
//a)实现playGame()方法
//		i.在使用5000元的iPhone手机玩游戏
	public void playGame() {
		System.out.println("在使用"+getPrice()+"元的"+getBrand()+"手机玩游戏");
	}
//b)提供空参,有参构造
	public SmartPhone() {
		super();
	}
	public SmartPhone(String brand, int price) {
		super(brand, price);
	}
}
