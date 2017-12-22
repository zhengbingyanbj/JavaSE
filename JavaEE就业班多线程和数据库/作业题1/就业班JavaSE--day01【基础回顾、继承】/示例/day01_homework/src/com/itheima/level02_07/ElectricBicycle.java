package com.itheima.level02_07;

/*
 3.定义电动车类(ElectricBicycle),继承Vehicle类
	a)成员方法: 充电 (charge())
		i.在方法中的输出格式为: 2个轮子的黑色电动自行车在充电
 */
public class ElectricBicycle extends Vehicle {
//	a)成员方法: 充电 (charge())
//		i.在方法中的输出格式为: 2个轮子的黑色电动自行车在充电
	public void charge(){
		System.out.println(wheel+"个轮子的"+color+"电动自行车在充电");
	}
}
