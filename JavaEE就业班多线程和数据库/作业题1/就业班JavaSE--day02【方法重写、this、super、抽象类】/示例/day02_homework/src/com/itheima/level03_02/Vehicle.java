package com.itheima.level03_02;

/*
 1. 定义抽象交通工具类(Vehicle)
	a)成员变量
		i.轮子个数 wheel 
		ii.颜色 color
	b)抽象方法
		i.跑  run()  
	c)要求： 提供提供空参构造和带参构造以及getters和setters方法
 */
public abstract class Vehicle {
//	a)成员变量
//		i.轮子个数 wheel 
	private int wheel;
//		ii.颜色 color
	private String color;
//b)抽象方法
//	i.跑  run()
	public abstract void run();
	
// c) 提供提供空参构造和带参构造以及getters和setters方法
	public Vehicle() {
		super();
	}
	public Vehicle(int wheel, String color) {
		this.wheel = wheel;
		this.color = color;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
