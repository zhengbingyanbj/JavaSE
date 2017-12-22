package com.itheima06;
/*
 *  线程的同步
 *  
 *  同步代码块
 *  	synchronized(任意对象){
 *  		可能出现问题的代码
 *  	}
 *  同步方法
 *  	在方法的返回值之前加上synchronized
 *  
 *  	同步方法有锁吗? 有  锁是谁? this
 *  	同步方法可以是静态的吗? 可以  
 *  	静态的同步方法锁还是this吗? 绝对不是
 *  	锁是谁? 类名.class
 *  
 *  ArrayList
 *  Vector
 *  
 */
public class SellTicket implements Runnable{

	private static int i = 100;
	
//	Object obj = new Object();
	
	@Override
	public void run() {
		
		while(true){
			
			sell();
		}
	}
	
	public static synchronized  void sell(){
//		synchronized(SellTicket.class){
			if(i>0){
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+"卖票了"+i);
				i--;
			}
//		}
		
	}

}
