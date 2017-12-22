package com.itheima.level02_06;
/*
 2.定义猫类(Cat),继承Animal类
	a)成员方法: 抓老鼠(catchMouse())
		i.在方法中的输出格式为: 棕色的Tom猫在抓老鼠 
 */
public class Cat extends Animal {
//	 抓老鼠(catchMouse())
	public void catchMouse(){
		System.out.println(color+"的"+name+"猫在抓老鼠");
	}
}
