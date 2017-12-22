package com.itheima.test01;


public class Test01_10 {

	public static void main(String[] args) {
		int result = jc(10);
		System.out.println(result);
	}
	// 递归求阶乘方法
	public static int jc(int num) {
		// 递归出口
		if(num == 1) return 1;
		return num * jc(num - 1);
	}

}
