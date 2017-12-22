package com.itheima05;
/*
 *  线程的同步
 *  
 *  同步代码块
 *  	synchronized(任意对象){
 *  		可能出现问题的代码
 *  	}
 *  同步方法
 */
public class SellTicket implements Runnable{

	private int i = 100;
	
//	Object obj = new Object();
	
	@Override
	public void run() {
		
		while(true){
			synchronized(this){
				if(i>0){
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					
					System.out.println(Thread.currentThread().getName()+"卖票了"+i);
					i--;
				}
			}
			
			
		}
	}

}
