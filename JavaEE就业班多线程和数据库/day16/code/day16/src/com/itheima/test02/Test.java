package com.itheima.test02;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;
/*
 * 读取配置文件的内容  反射调用set方法 为成员变量赋值
 */
public class Test {

	public static void main(String[] args) throws Exception {
		//创建集合
		Properties p = new Properties();
		InputStream in = Test.class.getClassLoader().getResourceAsStream("user.properties");
		p.load(in);
		System.out.println(p);
		
		//反射调用set方法
		//获取字节码文件对象
		Class c = Class.forName("com.itheima.bean.User");
		//快捷方式创建对象
		Object obj = c.newInstance();
//		System.out.println(obj);
		
		//拼接方法
		//方法名 = "set"+字符串形式的成员变量首字母大写+字符串形式成员变量其他字母
		//获取Properties集合中所有键的集合
		Set<String> keys = p.stringPropertyNames();
		//遍历集合 依次获取到每个字符串表现形式的成员变量
		for(String key : keys){
//			System.out.println(key);
			//拼接方法名
			String methodName="set"+key.substring(0, 1).toUpperCase()+key.substring(1);
//			System.out.println(methodName);
			//反射获取方法
			Method method = c.getMethod(methodName, String.class);
			//运行set方法
			method.invoke(obj, p.getProperty(key));
		}
		System.out.println(obj);
	}
}
