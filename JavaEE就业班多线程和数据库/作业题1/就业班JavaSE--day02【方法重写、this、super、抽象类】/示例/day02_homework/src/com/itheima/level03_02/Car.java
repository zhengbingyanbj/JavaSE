package com.itheima.level03_02;

/*
 2.定义小汽车类(Car),继承Vehicle类
	a)成员方法
		i.重写父类的run方法
			1.输出格式： 4个轮子的白色的汽车开着跑
		ii.特有方法: 加油 (addGasoline() ))
			1.在方法中的输出格式为: 4个轮子的白色汽车在加油
	b) 要求：提供空参构造和带参构造
 */
public class Car extends Vehicle{
//a)成员方法
//	i.重写父类的run方法
//		1.输出格式： 4个轮子的白色的汽车开着跑
	public void run(){
		System.out.println(getWheel()+"个轮子"+getColor()+"的汽车开着跑");
	}
//	ii.特有方法: 加油 (addGasoline())
//		1.在方法中的输出格式为: 4个轮子的白色小汽车在加油
	public void addGasoline(){
		System.out.println(getWheel()+"个轮子"+getColor()+"的汽车在加油");
	}
//b) 要求：提供空参构造和带参构造
	public Car() {
		super();
	}
	public Car(int wheel, String color) {
		super(wheel, color);
	}
	
}
