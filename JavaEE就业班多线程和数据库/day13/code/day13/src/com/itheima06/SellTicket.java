package com.itheima06;
/*
 *  �̵߳�ͬ��
 *  
 *  ͬ�������
 *  	synchronized(�������){
 *  		���ܳ�������Ĵ���
 *  	}
 *  ͬ������
 *  	�ڷ����ķ���ֵ֮ǰ����synchronized
 *  
 *  	ͬ������������? ��  ����˭? this
 *  	ͬ�����������Ǿ�̬����? ����  
 *  	��̬��ͬ������������this��? ���Բ���
 *  	����˭? ����.class
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
				
				System.out.println(Thread.currentThread().getName()+"��Ʊ��"+i);
				i--;
			}
//		}
		
	}

}
