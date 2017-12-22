package com.itheima.level1_11;

public class Test {
	
	static {
		System.out.println("Test 静态代码块");
	}
	public Test(){
		System.out.println("Test 构造方法");
	}
	public static void main(String[] args) {
		System.out.println("Test main方法");
		Test t = new Test();
	}
}
