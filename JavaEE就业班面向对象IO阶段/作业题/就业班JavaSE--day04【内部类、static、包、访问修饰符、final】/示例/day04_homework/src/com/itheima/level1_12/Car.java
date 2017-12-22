package com.itheima.level1_12;
/*
  1.定义一个汽车类(Car)
	a)成员变量: 状态(status),true表示运行状态一种,false表示停止状态.
	b)成员内部类: 发动机(Engine) 
		i.成员方法:work()
			1.如果汽车的运行状态打印发动机就飞速旋转
			2.否则打印发动机停止工作
	c)提供:状态(status)的getter和setter方法
 */
public class Car {
//	a)成员变量: 状态(status),true表示运行状态一种,false表示停止状态.
	private boolean status;
//	b)成员内部类: 发动机(Engine)
	public class Engine{
//		i.成员方法:work()
		public void work(){
//		1.如果汽车的运行状态打印发动机就飞速旋转
			if(status){
				System.out.println("发动机就飞速旋转");
			}else{
//		2.否则打印发动机停止工作
				System.out.println("发动机停止工作");
			}
		}
	}
//	状态(status)的getter和setter方法
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
