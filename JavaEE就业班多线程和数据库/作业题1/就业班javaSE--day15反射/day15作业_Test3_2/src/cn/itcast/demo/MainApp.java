package cn.itcast.demo;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;
/*
 *已知一个类，定义如下：

package com.itcast.demo;

public class DemoClass {

public void run() {

System.out.println("welcome to heima!");

}

}

(1)写一个Properties格式的配置文件，配置类的完整名称。

(2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，

(3)用反射 的方式运行run方法。
 */
public class MainApp {
	public static void main(String[] args) throws Exception {
		 
		//创建一个Properties类 
		Properties prop = new Properties();
		
		prop.load(new FileReader("db.properties"));
		
		//解析集合数据 
		String className = prop.getProperty("className");
		
		//根据路径获取字节码对象那个
		Class clazz = Class.forName(className);
		
		//获取对象
		Object obj = clazz.newInstance();
		
		
		//反射获取run方法
		Method method = clazz.getMethod("run");
		
		method.invoke(obj);
	   }
}
