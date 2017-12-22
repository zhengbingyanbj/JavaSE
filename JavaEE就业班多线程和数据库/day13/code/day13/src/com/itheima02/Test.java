package com.itheima02;
/*
 * 创建线程的第一种方式
 * 
 * java.lang.Thread类
 * 		String getName()  获取线程名称
 * 		void setName(String name)  设置线程名称
 * 		static Thread currentThread() 获取当前线程对象
 * 
 * 
 * 1.定义一个类继承Thread类
 * 2.重写run方法 (要在线程中执行的代码   线程任务)
 * 3.开启线程 
 * 		创建子类对象
 * 		调用start方法
 * 
 * run方法和start方法的区别
 * 如果调用run方法 程序还是一个单线程的程序
 * 如果调用start方法 开启新的线程  并且jvm会自动调用run方法
 * 
 */
public class Test {

	public static void main(String[] args) {
		SubThread st = new SubThread();
		
		st.setName("小白");
//		st.run();
		st.start();
		
		SubThread st2 = new SubThread();
		st2.setName("狗剩");
		st2.start();
		//获取当前线程对象 而当前线程对象是主线程 获取到的就是主线程的线程对象
		Thread mainThread = Thread.currentThread();
		
		for (int i = 0; i < 50; i++) {
			System.out.println(mainThread.getName()+".."+i);
		}
		
	}
}
