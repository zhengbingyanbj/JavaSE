package com.itheima.test01;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
/*
 * ��ȡsrc���ļ�
 * InputStream in = ����.class.getClassLoader().getResourceAsStream("�ļ���")
 */
public class Test02 {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		//�������ļ������ݼ��ؽ�����
		InputStream in =Test02.class.getClassLoader().getResourceAsStream("config.properties");
		p.load(in);
//		System.out.println(p);
		
		
		String className=p.getProperty("className");
		String methodName=p.getProperty("methodName");
		
		//��ȡ�ֽ����ļ�����
		Class c = Class.forName(className);
		//��ȡ����
		Method method = c.getMethod(methodName);
		//���з���
		Object obj = c.newInstance();
		method.invoke(obj);
		
		
		
	}
}
