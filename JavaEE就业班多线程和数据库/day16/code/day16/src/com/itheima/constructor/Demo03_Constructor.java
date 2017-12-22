package com.itheima.constructor;

import java.lang.reflect.Constructor;

/*
 * 反射私有的构造方法并运行
 * 暴力反射 (不推荐使用)
 * 
 * 1.获取字节码文件对象
 * 2.通过字节码文件对象获取私有的构造方法
 * 		Class类的方法
 * 			 Constructor[] getDeclaredConstructors() 获取所有构造方法包括私有
 * 			 Constructor getDeclaredConstructor(Class...parameterTypes) 
 * 			 获取指定的构造方法 可以获取私有
 * 
 * 3.取消访问权限检查
 * 		AccessibleObject类
 * 			 void setAccessible(boolean flag) 
 * 			  flag值为true则取消检查

 * 3.运行构造方法
 * 
 */
public class Demo03_Constructor {

	public static void main(String[] args) throws Exception {
		Class c =Class.forName("com.itheima.bean.Person");
		//获取所有构造方法
//		Constructor[] cons = c.getDeclaredConstructors();
//		for (Constructor con : cons) {
//			System.out.println(con);
//		}
		//获取指定的私有的构造方法
		Constructor con = c.getDeclaredConstructor(String.class);
//		System.out.println(con);
		
		//取消检查
		con.setAccessible(true);
		//运行构造方法
		Object obj = con.newInstance("tangyan");
		System.out.println(obj);
	}
}
