package com.itheima03;
/*
 * �̴߳����ĵڶ��ַ�ʽ
 * 
 * 1.����ʵ����ʵ��Runnable�ӿ�
 * 2.��дrun����  ��run�����ж����߳�����
 * 3.�����߳�
 * 		����ʵ�������
 * 		����Thread�����
 * 			Thread(Runnable r)
 * 			����   ��Ҫ���ǽӿ� ���ǿ��Դ�����ʵ�������
 * 		ͨ��Thread��������start����
 * 
 * �ڶ��ַ�ʽ�ĺô� 
 * 		1.�����˵��̳еľ�����
 * 		2.�߳�������̶߳���ֿ�  ����
 * 
 */
public class Test {

	public static void main(String[] args) {
		SubRun sr = new SubRun();
		Thread t = new Thread(sr);
		t.start();
		
		
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+".."+i);
		}
		
	}
}
