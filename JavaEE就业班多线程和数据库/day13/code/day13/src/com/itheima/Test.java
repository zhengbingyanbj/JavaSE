package com.itheima;
/*
 * Ö÷Ïß³Ì
 */
public class Test {

	public static void main(String[] args) {
//		System.out.println(1/0);
		method();
		System.out.println(Math.abs(-10));
	}
	
	public static void method(){
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
	}
}
