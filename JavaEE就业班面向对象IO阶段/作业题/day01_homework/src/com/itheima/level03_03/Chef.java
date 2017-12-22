package com.itheima.level03_03;

/*
 3. 定义Chef类,继承Employee类
	1. 行为：  炒菜  public void cooking() 
	    输出格式为： 30岁的厨师秦俊杰正在炒菜
 */
public class Chef extends Employee{
//	行为： 炒菜 public void cooking() 
	 public void cooking() {
		 System.out.println(age+"岁的厨师"+name+"正在炒菜");
	 }
}
