package com.itheima.level03_03;

/*
  	2. 定义Waiter类,继承Employee类
 		1. 行为： 上菜 public void serving()
 		    输出格式为： 18岁的服务员景甜正在上菜
 */
public class Waiter extends Employee {
//	1. 行为： 上菜 public void serve()
	public void serving(){
		System.out.println(age+"岁的服务员"+name+"正在上菜");
	}
}
