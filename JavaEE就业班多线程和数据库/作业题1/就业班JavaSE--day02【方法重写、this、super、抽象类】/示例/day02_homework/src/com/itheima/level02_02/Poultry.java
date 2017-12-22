package com.itheima.level02_02;

/*
 1.定义家禽类(Poultry)
	i.成员变量(私有):  颜色(color),年龄(age)
	ii.成员方法:  吃饭(void eat())
		1.输出格式:  2岁的红色家禽在吃饭
	iii.提供空参和带参构造方法
	iv.提供setXxx和getXxx方法
 */
public class Poultry {
//	i.成员变量(私有):  
//	颜色(color)
	private String color;
//	年龄(age)
	private int age;
//	ii.成员方法:  吃饭(void eat())
//		1.输出格式:  2岁的红色家禽在吃饭
	public void eat(){
		System.out.println(age+"岁的"+color+"的家禽在吃饭");
	}
//	iii.提供空参和带参构造方法
	public Poultry() {
		super();
	}
	public Poultry(String color, int age) {
		super();
		this.color = color;
		this.age = age;
	}	
//	iv.提供setXxx和getXxx方法
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
