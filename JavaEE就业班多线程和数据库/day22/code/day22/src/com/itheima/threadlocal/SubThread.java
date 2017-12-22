package com.itheima.threadlocal;

public class SubThread extends Thread{

	private ThreadLocal<String> t;//0x1111
	
	
	public SubThread(ThreadLocal<String> t) {
		super();
		this.t = t;
	}


	public void run(){
		String string = t.get();
		System.out.println("sub.."+string);
		
	}
}
