package com.itheima.level02_07;
/*
 		 
1.定义交通工具类(Vehicle)
	a)成员变量
		i.轮子个数 wheel 
		ii.颜色 color
	b)成员方法
		i.跑  run()  
		1.打印格式:  4个轮子白色的车在跑
	c)要求:
		i.成员变量不带权限修饰符,方法是公共权限的.
 */
public class Vehicle {
//	a)成员变量
//		i.轮子个数 wheel 
	int wheel;
//		ii.颜色 color
	String color;
//b)成员方法
//	i.跑  run()  
//	1.打印格式:  四个轮子白色的车在跑
	public void run(){
		System.out.println(wheel+"个轮子"+color+"的车在跑");
	}
}
