package com.itheima04;
/*
 * Thread类的sleep方法  休眠
 * 		static void sleep(long 毫秒值) 休眠多少毫秒自己醒来
 * 		
 */
public class Test02 {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			
			Thread.sleep(1000);
			System.out.println(i);
		}
	}
}
