package com.itheima.method;

import java.lang.reflect.Method;

import com.itheima.bean.Person;

/*
 * 反射获取get/set方法并运行
 * 
 * 1.获取字节码文件对象
 * 2.通过字节码文件对象 获取get/set方法
 * 		Class类 
 * 			Method[] getMethods() 所有公共的方法 包括继承
 * 			Method getMethod(String methodName,Class...c) 获取指定的构造方法
 * 			参数 
 * 				String methodName 方法名 
 * 				Class...c:方法的参数的数据类型 如果是String类型  String.class
 * 
 * 3.运行get/set方法
 *		Method类的方法
 *			 Object invoke(Object obj, Object... args)  执行方法
 *			 返回值 
 *				Object：方法运行的返回值 有的方法没有返回值  返回null 
 *			参数  
 *				Object obj:运行方法的对象 
 *				 Object... args:运行方法需要传递的实际参数
 *		
 */
public class Demo01_Method {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itheima.bean.Person");
		//获取所有公共的方法
//		Method[] methods = c.getMethods();
//		//遍历数据 依次获取每个方法对象
//		for (Method method : methods) {
//			System.out.println(method);
//		}
		//获取setAge方法
		Method setAgeMethod = c.getMethod("setAge", int.class);
//		System.out.println(setAgeMethod);
		
		//运行setAge方法
//		Person p = new Person();
		//快捷方式创建对象
		Object obj = c.newInstance();
		setAgeMethod.invoke(obj,38);
		System.out.println(obj);
		
		//获取getAge方法 
		Method getAgeMethod = c.getMethod("getAge");
		Object age = getAgeMethod.invoke(obj);
		System.out.println(age);
		
	}
}
