package com.itheima.level2_02;

public class Test {
	
	static {
		System.out.println("Test 类的静态代码块");
	}
	
	public static void main(String[] args) {
		System.out.println("执行main方法");
//		创建学生对象
		Student s1 = new Student("main");
	}
}
