package com.itheima.level03_01;

/*
 1. 定义动物类（Animal）类
  	1. 属性： 颜色（color），腿的个数(numOfLegs)
	2.成员方法: eat()
		a)输出格式: 白色4条腿的动物在吃东西
	3. 提供带参构造和setXxx和getXxx方法
 */
public class Animal {
//  1. 属性： 颜色（color），腿的个数(numOfLegs)
	private String color;
	private int numOfLegs;
//	2.成员方法: eat()
//		a)输出格式: 白色4条腿的动物在吃东西
	public void eat(){
		System.out.println(color+numOfLegs+"条腿的动物在吃东西");
	}
//	3. 提供带参构造和setXxx和getXxx方法
	public Animal() {
		super();
	}
	public Animal(String color, int numOfLegs) {
		super();
		this.color = color;
		this.numOfLegs = numOfLegs;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
}
