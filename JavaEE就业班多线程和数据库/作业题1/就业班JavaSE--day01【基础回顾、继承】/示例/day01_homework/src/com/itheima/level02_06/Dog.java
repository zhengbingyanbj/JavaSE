package com.itheima.level02_06;

/*
 3.定义狗类(Dog),继承Animal类
	a)成员方法: 看家 (lookHome())
		i.在方法中的输出格式为: 白色的Jerry狗在看家 
 */
public class Dog extends Animal {
//	看家 (lookHome())
	public void lookHome(){
		System.out.println(color+"的"+name+"狗在看家");
	}
}
