package com.itheima07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * JDK1.5������   
 * 
 * java.util.concurrent.locks.Lock �ӿ�
 * ʵ����
 * 	ReentrantLock
 * 		���췽��
 * 			ReentrantLock()
 * 
 * ����
 * 		 void lock()  ��ȡ��
 * 		 void unlock()  �ͷ���
 * 
 * 
 * 
 * sleep��wait������
 * sleep��Thread��ķ��� �Լ�˯�Լ���  ������ʱ���ͷ���
 * wait��Object��ķ���  ����notify����  ���������������� ��wait���ͷ���
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

						System.out.println(Thread.currentThread().getName()+"��Ʊ��"+i);
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