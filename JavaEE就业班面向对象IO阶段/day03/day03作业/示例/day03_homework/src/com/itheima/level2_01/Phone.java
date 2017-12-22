package com.itheima.level2_01;
/*
 2.定义手机类(Phone)类
	a)属性: 品牌(brand),价格(price)
	b)功能: 
		i.打电话(call(String name))
			1.输出格式: 在使用100 元 诺基亚 手机 给 景甜 打电话
		ii.发短信(sendMessage(String name))
			1.输出格式: 在使用100 元 诺基亚 手机 给 景甜 发短信
	c)提供 空参,有参构造;setters和getters方法
 */
public class Phone {
//	a)属性: 品牌(brand),价格(price)
	private String brand;
	private int price;
//	b)功能: 
//		i.打电话(call(String name))
//			1.输出格式: 在使用100 元 诺基亚 手机 给 景甜 打电话
	public void call(String name){
		System.out.println("在使用"+price+"元 "+brand+" 手机 给 "+name+" 打电话");
	}
//		ii.发短信(sendMessage(String name))
//			1.输出格式: 在使用100 元 诺基亚 手机 给 景甜 发短信
	public void sendMessage(String name){
		System.out.println("在使用"+price+"元 "+brand+" 手机 给 "+name+" 发短信");
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
