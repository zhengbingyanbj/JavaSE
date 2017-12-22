package com.itheima03;
/*
 * 线程创建的第二种方式
 * 
 * 1.定义实现类实现Runnable接口
 * 2.重写run方法  在run方法中定义线程任务
 * 3.开启线程
 * 		创建实现类对象
 * 		创建Thread类对象
 * 			Thread(Runnable r)
 * 			参数   需要的是接口 但是可以传入其实现类对象
 * 		通过Thread类对象调用start方法
 * 
 * 第二种方式的好处 
 * 		1.避免了单继承的局限性
 * 		2.线程任务和线程对象分开  解耦
 * 
 */
public class Test {

	public static void main(String[] args) {
		SubRun sr = new SubRun();
		Thread t = new Thread(sr);
		t.start();
		
		
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+".."+i);
		}
		
	}
}
