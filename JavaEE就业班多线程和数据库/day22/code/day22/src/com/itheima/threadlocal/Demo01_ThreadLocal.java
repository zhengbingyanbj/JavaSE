package com.itheima.threadlocal;
/*
 * ThreadLocal<T> ����  
 * 				�ص�  ��ǰ�̴߳洢������ ֻ�ܵ�ǰ�̻߳�ȡ �����̻߳�ȡ����
 * set(T value) ��ǰ�߳����������������
 * get() ��ǰ�̻߳�ȡ����
 * 
 */
public class Demo01_ThreadLocal {

	public static void main(String[] args) {
		ThreadLocal<String> t = new ThreadLocal<String>();//0x1111
		
		t.set("abc");
		
		String string = t.get();
		System.out.println(string);
		
		
		SubThread st = new SubThread(t);
		st.start();
	}
}
