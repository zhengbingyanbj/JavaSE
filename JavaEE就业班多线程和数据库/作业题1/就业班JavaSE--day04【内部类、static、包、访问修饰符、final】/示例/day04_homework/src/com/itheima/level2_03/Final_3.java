package com.itheima.level2_03;
/*
 3.验证: final修饰的变量称为常量，这些变量只能赋值一次
 
 */
public class Final_3 {
	public static void main(String[] args) {
		final int a = 10;
//		被final修饰变量为常量,只能赋值一次
//		a = 20; //编译报错:The final local variable a cannot be assigned
		
		final int b;
		b = 5;
//		被final修饰变量为常量,只能赋值一次
//		b = 10; //编译标错:The final local variable b may already have been assigned
	}
}
