package com.itheima04;
/*
 * �����ڲ��ഴ���߳�
 * 
 * �����ڲ�������:��ʱ����һ������������Ŀ�ݷ�ʽ
 * new ����/�ӿ�(){
 * 		��д����
 * };
 * 
 */
public class Test {

	public static void main(String[] args) {
		/*
		 * ��Ҫ��Thread����������
		 */
		Thread t = new Thread(){
			public void run(){
				System.out.println("������");
			}
		};
		t.start();
		t.start();
		
		/*
		 * ��Ҫ��Runnable�ӿڵ�ʵ�������
		 */
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("##");
				
			}
		};
		
		new Thread(r).start();
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("%%%");
				
			}
		}).start();
		
	}
}
