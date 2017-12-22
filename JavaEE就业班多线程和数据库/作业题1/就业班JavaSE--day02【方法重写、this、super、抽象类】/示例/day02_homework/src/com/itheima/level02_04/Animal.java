package com.itheima.level02_04;

/*
 1.定义抽象类 动物类(Animal)
	i.成员变量(私有):  颜色(color),腿的个数(numOfLegs)
	ii.抽象方法:  吃饭(void eat())
	iii.提供空参和带参构造方法
	iv.提供setXxx和getXxx方法
 */
public abstract class Animal {
//	i.成员变量(私有):  颜色(color),腿的个数(numOfLegs)
	private String color;
	private int numOfLegs;
//	ii.抽象方法:  吃饭(void eat())
	public abstract void eat();
//	iii.提供空参和带参构造方法
	public Animal() {
	}
	
	public Animal(String color, int numOfLegs) {
		this.color = color;
		this.numOfLegs = numOfLegs;
	}
//	iv.提供setXxx和getXxx方法
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
