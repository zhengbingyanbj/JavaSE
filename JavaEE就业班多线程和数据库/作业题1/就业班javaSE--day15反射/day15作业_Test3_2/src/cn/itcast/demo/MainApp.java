package cn.itcast.demo;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;
/*
 *��֪һ���࣬�������£�

package com.itcast.demo;

public class DemoClass {

public void run() {

System.out.println("welcome to heima!");

}

}

(1)дһ��Properties��ʽ�������ļ�����������������ơ�

(2) дһ�����򣬶�ȡ���Properties�����ļ����������������Ʋ���������࣬

(3)�÷��� �ķ�ʽ����run������
 */
public class MainApp {
	public static void main(String[] args) throws Exception {
		 
		//����һ��Properties�� 
		Properties prop = new Properties();
		
		prop.load(new FileReader("db.properties"));
		
		//������������ 
		String className = prop.getProperty("className");
		
		//����·����ȡ�ֽ�������Ǹ�
		Class clazz = Class.forName(className);
		
		//��ȡ����
		Object obj = clazz.newInstance();
		
		
		//�����ȡrun����
		Method method = clazz.getMethod("run");
		
		method.invoke(obj);
	   }
}
