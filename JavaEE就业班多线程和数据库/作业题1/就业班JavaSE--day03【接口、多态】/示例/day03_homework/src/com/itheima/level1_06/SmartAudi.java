package com.itheima.level1_06;

/*
 3.定义智能奥迪车类(SmartAudi) 继承Audi实现Smart接口
	a)成员方法
	i.实现automaticParking方法
		1.输出:智能奥迪车在自动泊车
	ii.实现automaticDrive方法
		1.输出:智能奥迪车在无人驾驶
 */
public class SmartAudi extends Audi implements Smart {

//	i.实现automaticParking方法
	public void automaticParking() {
		System.out.println("智能奥迪车在自动泊车");
	}
//  ii.实现automaticDrive方法
	public void automaticDrive() {
	   System.out.println("智能奥迪车在自动驾驶");
	}
}
