package com.itheima04;
/*
 * Thread���sleep����  ����
 * 		static void sleep(long ����ֵ) ���߶��ٺ����Լ�����
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
