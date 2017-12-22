package com.itheima.constructor;
/*
 * 反射创建对象快捷方式
 * 前提 
 * 	  类必须具备空参构造方法
 * 	  空参构造方法权限必须是public
 * 
 * 1.获取字节码文件对象
 * 2.通过字节码文件对象直接创建对象
 * 		Class类 
 * 			Object newInstance()
 */
public class Demo04_Constructor {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itheima.bean.Person");
		//快捷方式创建对象
		Object obj = c.newInstance();
		System.out.println(obj);
	}
}
