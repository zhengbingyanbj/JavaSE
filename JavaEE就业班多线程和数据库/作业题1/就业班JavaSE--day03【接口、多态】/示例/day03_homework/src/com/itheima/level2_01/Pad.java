package com.itheima.level2_01;
/*
 4.定义平板(Pad)类,实现PlayGame接口
	a)属性:品牌(brand),价格(price)
	b)成员方法
		i.实现playGame()方法
			1.输出格式: 在使用2000元的iPad平板玩游戏
		ii.特有方法: 听音乐(listenMusic)
			1.输出格式: 在使用2000元的iPad平板玩听音乐
	c)提供空参,有参构造,setters和getters方法
 */
public class Pad implements PlayGame {
//	a)属性:品牌(brand),价格(price)
	private String brand;
	private int price;
//	b)成员方法
//		i.实现playGame()方法
//			1.输出格式: 在使用2000元的iPad平板玩游戏
	public void playGame() {
		System.out.println("在使用"+price+"元的"+brand+"平板玩游戏");
	}
//		ii.特有方法: 听音乐(listenMusic)
//			1.输出格式: 在使用2000元的iPad平板听音乐
	public void listenMusic(){
		System.out.println("在使用"+price+"元的"+brand+"平板听音乐");
	}
//	c)提供空参,有参构造,setters和getters方法
	public Pad() {
		super();
	}
	
	public Pad(String brand, int price) {
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
