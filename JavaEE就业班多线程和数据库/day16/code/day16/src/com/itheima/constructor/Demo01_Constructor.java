package com.itheima.constructor;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

/*
 * 获取空参构造方法并运行
 * 
 * 1.获取字节码文件对象
 * 2.通过字节码文件对象获取空参构造方法
 * 		Class类
 * 			Constructor[] getConstructors() 获取所有的公共的构造方法
 * 			Constructor getConstructor() 获取指定的构造方法 不给参数获取的就是空参构造 
 * 3.运行空参构造方法
 * 		Constructor方法
 * 			 Object newInstance() 运行构造方法
 * 
 */
public class Demo01_Constructor {

	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class c = Class.forName("com.itheima.bean.Person");
		//获取所有公共的构造方法
//		Constructor[] cons = c.getConstructors();
//		for(Constructor con:cons){
//			System.out.println(con);
//		}
//		
//		Constructor con = cons[0];
		//获取空参构造方法
		Constructor con = c.getConstructor();
		//运行空参构造方法
		Object obj = con.newInstance();//Object obj = new Person();
		System.out.println(obj.toString());
		
	
	}
}
