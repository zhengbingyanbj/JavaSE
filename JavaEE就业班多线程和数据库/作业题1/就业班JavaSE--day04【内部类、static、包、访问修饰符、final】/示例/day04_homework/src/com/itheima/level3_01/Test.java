package com.itheima.level3_01;

public class Test {

//	实例(对象)成员变量
	Student s = new Student("成员变量显式初始化的时候");
	
//	静态代码块
	static {
		System.out.println("Test 类的静态代码块");
	}

	
	public static void main(String[] args) {
		System.out.println("main方法");
//		创建学生对象
		Student s1 = new Student("main方法中");
//		创建Test对象
		Test t = new Test();
	}
}
