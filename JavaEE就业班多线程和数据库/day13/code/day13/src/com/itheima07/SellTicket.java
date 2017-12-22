package com.itheima07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * JDK1.5新特性   
 * 
 * java.util.concurrent.locks.Lock 接口
 * 实现类
 * 	ReentrantLock
 * 		构造方法
 * 			ReentrantLock()
 * 
 * 方法
 * 		 void lock()  获取锁
 * 		 void unlock()  释放锁
 * 
 * 
 * 
 * sleep和wait的区别
 * sleep是Thread类的方法 自己睡自己醒  当休眠时不释放锁
 * wait是Object类的方法  必须notify唤醒  必须锁对象来调用 当wait后释放锁
 * 
 * 
 */
public class SellTicket implements Runnable{

	private int i = 100;
	
	Lock l = new ReentrantLock();
	
	@Override
	public void run() {
		
		while(true){
				
				l.lock();
				if(i>0){
					
					try {
						Thread.sleep(100);

						System.out.println(Thread.currentThread().getName()+"卖票了"+i);
						i--;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}finally {
						l.unlock();
					}
					
					
				}
				
			}
			
			
	}

}