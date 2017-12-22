package com.itheima.constructor;

import java.lang.reflect.Constructor;

/*
 * 反射带参构造方法并运行
 * 
 * 1.获取字节码文件对象
 * 2.获取带参构造方法
 * 		Class类
 * 			Constructor  getConstructor(Class...c) 获取指定的构造方法
 * 			参数 
 * 				Class...c:Class类型的可变参数 
 * 				 构造方法的参数的数据类型 如果参数是String类型  Strin.class
 * 3.运行构造方法
 * 		Constructor类
 * 			Object newInstance(Object...args)
 * 			参数 
 * 				Object...args:Object类型可变参数  给的是运行构造方法的实际参数
 */
public class Demo02_Constructor {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itheima.bean.Person");
		//获取带参构造方法
		Constructor con = c.getConstructor(String.class,int.class);
//		System.out.println(con);
		//运行带参构造方法
		Object obj = con.newInstance("liuyan",38);//Object obj = new Person("liuyan"，38);
		System.out.println(obj);
	
	}
}
