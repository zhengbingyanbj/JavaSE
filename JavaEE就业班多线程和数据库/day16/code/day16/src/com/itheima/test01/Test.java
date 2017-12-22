package com.itheima.test01;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 向一个存储类型为Integer类型的集合中添加String类型的数据
 * 
 * 泛型:java中的泛型叫做伪泛型 编译时存在 当运行时 泛型就不存在了
 */
public class Test {

	public static void main(String[] args) throws Exception, SecurityException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
//		list.add("abc");
		
		//获取ArrayList的字节码文件对象
		Class c  = list.getClass();
		//获取add方法
		Method addMethod = c.getMethod("add", Object.class);
		//运行add方法 
		addMethod.invoke(list, "abc");
		addMethod.invoke(list, "abcd");
		addMethod.invoke(list, true);
		
		System.out.println(list);
	}
}
