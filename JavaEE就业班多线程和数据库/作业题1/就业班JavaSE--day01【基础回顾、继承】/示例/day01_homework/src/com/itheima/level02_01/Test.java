package com.itheima.level02_01;
/*
  请使用代码描述:  18岁的景甜在使用iPhone手机玩游戏
 
 3.定义Test类
	a)提供main方法
	b)在main方法中
	i.创建手机对象,并把手机品牌赋值为iPhone
	ii.创建Person对象,并把名称赋值为景甜,年龄赋值为18
	iii.调用Person对象的,usePhone方法,传入手机对象
	iv.打印格式如下:
	        18岁的景甜在使用iPhone手机玩游戏
 */
public class Test {
	public static void main(String[] args) {
//	i.创建手机对象,并把手机品牌赋值为iPhone
		Phone phone = new Phone("iPhone");
//	ii.创建Person对象,并把名称赋值为景甜,年龄赋值为18
		Person person = new Person("景甜", 18);
//	iii.调用Person对象的,usePhone方法,传入手机对象
		person.usePhone(phone);
	}
}
