package com.itheima.level3_01;

public class Student {
	
	static {
		System.out.println("Student 类的静态代码块");
	}
	
	public Student(){
		System.out.println("Student 类的构造方法");
	}
	
	public Student(String methodName){
		System.out.println("在"+methodName+"创建Student对象调用的");
	}
}
