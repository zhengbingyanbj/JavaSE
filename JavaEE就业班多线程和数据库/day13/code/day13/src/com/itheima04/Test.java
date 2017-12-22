package com.itheima04;
/*
 * 匿名内部类创建线程
 * 
 * 匿名内部类作用:临时定义一个类的子类对象的快捷方式
 * new 父类/接口(){
 * 		重写方法
 * };
 * 
 */
public class Test {

	public static void main(String[] args) {
		/*
		 * 需要的Thread类的子类对象
		 */
		Thread t = new Thread(){
			public void run(){
				System.out.println("！！！");
			}
		};
		t.start();
		t.start();
		
		/*
		 * 需要的Runnable接口的实现类对象
		 */
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("##");
				
			}
		};
		
		new Thread(r).start();
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("%%%");
				
			}
		}).start();
		
	}
}
