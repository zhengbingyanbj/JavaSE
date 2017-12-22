package com.itheima.threadlocal;
/*
 * ThreadLocal<T> 容器  
 * 				特点  当前线程存储的内容 只能当前线程获取 其他线程获取不到
 * set(T value) 当前线程向容器中添加数据
 * get() 当前线程获取数据
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
