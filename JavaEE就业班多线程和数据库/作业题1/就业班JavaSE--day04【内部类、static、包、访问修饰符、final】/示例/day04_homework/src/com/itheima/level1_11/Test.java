package com.itheima.level1_11;

public class Test {
	
	static {
		System.out.println("Test ��̬�����");
	}
	public Test(){
		System.out.println("Test ���췽��");
	}
	public static void main(String[] args) {
		System.out.println("Test main����");
		Test t = new Test();
	}
}
