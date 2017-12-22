package com.itheima.level02_07;

/*
 2.定义小汽车类(Car),继承Vehicle类
	a)成员方法: 加油 (addGasoline() ))
		i.在方法中的输出格式为: 4个轮子的白色小汽车在加油
 */
public class Car extends Vehicle{
//	a)成员方法: 加油 (addGasoline() ))
//		i.在方法中的输出格式为: 4个轮子的白色小汽车在加油
	public void addGasoline(){
		System.out.println(wheel+"个轮子的"+color+"小汽车在加油");
	}
}
