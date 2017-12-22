package com.itheima.level03_03;

/*
1. 定义Employee类
	1. 属性： 名称：name,年龄 age
    2. 行为： 说话（say）
                          输出格式： 18岁的员工景甜在说话
	3. 要求： 成员变量不加权限private 
 */
public class Employee {
//	名称：name
	String name;
//	年龄 age
	int age;
//	说话（say）
	public void say(){
		System.out.println(age+"岁的员工"+name+"在说话");
	}
}
