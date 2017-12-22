package com.itheima.level03_02;
/*
 3.定义电动车类(ElectricBicycle),继承Vehicle类
	a)成员方法
		i.重写父类的run方法
			1.输出格式： 2个轮子的黑色的电动车骑着跑
		ii.特有成员方法: 充电 (charge())
			1.在方法中的输出格式为: 2个轮子的黑色电动自行车在充电
	b) 要求：提供提供空参构造和带参构造
 */
public class ElectricBicycle extends Vehicle{
//	a)成员方法
//		i.重写父类的run方法
//			1.输出格式： 2个轮子的黑色的电动车骑着跑
	public void run() {
		System.out.println(getWheel()+"个轮子的"+getColor()+"的电动车骑着跑");
	}
//	ii.特有成员方法: 充电 (charge())
//		1.在方法中的输出格式为: 2个轮子的黑色电动自行车在充电
	public void charge(){
		System.out.println(getWheel()+"个轮子的"+getColor()+"的电动车在充电");
	}
//  b) 要求：提供提供空参构造和带参构造
	public ElectricBicycle() {
		super();
	}
	public ElectricBicycle(int wheel, String color) {
		super(wheel, color);
	}
	
}
