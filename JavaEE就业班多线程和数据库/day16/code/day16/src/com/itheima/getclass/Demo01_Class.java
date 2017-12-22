package com.itheima.getclass;

import com.itheima.bean.Person;

/*
 * 获取字节码文件对象的三种方式
 * 
 * 1.Object类的getClass方法 
 * 		Class getClass() 
 * 2.每种类型都具备一个隐藏的静态的class属性 包括基本类型
 * 		类名.class
 * 3.Class类的静态方法
 * 		static Class forName(String className)
 */
public class Demo01_Class {

	public static void main(String[] args) throws ClassNotFoundException {
		//通过Object的getClass方法
		Person p = new Person();
		Class c1 = p.getClass();
		System.out.println(c1);
		
		//通过静态class属性获取
		Class c2 = Person.class;
		System.out.println(c2);
		System.out.println(c1==c2);
		
		//通过Class类的静态方法
		Class c3 = Class.forName("com.itheima.bean.Person");
		System.out.println(c3);
		System.out.println(c1 == c3);
	}
}
