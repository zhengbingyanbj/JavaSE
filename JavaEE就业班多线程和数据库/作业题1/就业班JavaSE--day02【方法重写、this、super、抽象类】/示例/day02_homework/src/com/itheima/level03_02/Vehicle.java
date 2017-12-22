package com.itheima.level03_02;

/*
 1. �������ͨ������(Vehicle)
	a)��Ա����
		i.���Ӹ��� wheel 
		ii.��ɫ color
	b)���󷽷�
		i.��  run()  
	c)Ҫ�� �ṩ�ṩ�ղι���ʹ��ι����Լ�getters��setters����
 */
public abstract class Vehicle {
//	a)��Ա����
//		i.���Ӹ��� wheel 
	private int wheel;
//		ii.��ɫ color
	private String color;
//b)���󷽷�
//	i.��  run()
	public abstract void run();
	
// c) �ṩ�ṩ�ղι���ʹ��ι����Լ�getters��setters����
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
