package com.itheima.test01;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
/*
 * 读取src下文件
 * InputStream in = 类名.class.getClassLoader().getResourceAsStream("文件名")
 */
public class Test02 {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		//将配置文件的内容加载进集合
		InputStream in =Test02.class.getClassLoader().getResourceAsStream("config.properties");
		p.load(in);
//		System.out.println(p);
		
		
		String className=p.getProperty("className");
		String methodName=p.getProperty("methodName");
		
		//获取字节码文件对象
		Class c = Class.forName(className);
		//获取方法
		Method method = c.getMethod(methodName);
		//运行方法
		Object obj = c.newInstance();
		method.invoke(obj);
		
		
		
	}
}
