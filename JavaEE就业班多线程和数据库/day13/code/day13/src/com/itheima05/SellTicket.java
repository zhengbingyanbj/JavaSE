package com.itheima05;
/*
 *  �̵߳�ͬ��
 *  
 *  ͬ�������
 *  	synchronized(�������){
 *  		���ܳ�������Ĵ���
 *  	}
 *  ͬ������
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
					
					
					System.out.println(Thread.currentThread().getName()+"��Ʊ��"+i);
					i--;
				}
			}
			
			
		}
	}

}
