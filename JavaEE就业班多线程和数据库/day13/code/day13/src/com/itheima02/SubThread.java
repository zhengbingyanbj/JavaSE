package com.itheima02;

public class SubThread extends Thread{

	@Override
	public void run() {
		
//		setName("����");
		for (int i = 0; i <50; i++) {
			System.out.println(Thread.currentThread().getName()+".."+i);
		}
	}

	
	
	
}
