package com.itheima.test02;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;
/*
 * ��ȡ�����ļ�������  �������set���� Ϊ��Ա������ֵ
 */
public class Test {

	public static void main(String[] args) throws Exception {
		//��������
		Properties p = new Properties();
		InputStream in = Test.class.getClassLoader().getResourceAsStream("user.properties");
		p.load(in);
		System.out.println(p);
		
		//�������set����
		//��ȡ�ֽ����ļ�����
		Class c = Class.forName("com.itheima.bean.User");
		//��ݷ�ʽ��������
		Object obj = c.newInstance();
//		System.out.println(obj);
		
		//ƴ�ӷ���
		//������ = "set"+�ַ�����ʽ�ĳ�Ա��������ĸ��д+�ַ�����ʽ��Ա����������ĸ
		//��ȡProperties���������м��ļ���
		Set<String> keys = p.stringPropertyNames();
		//�������� ���λ�ȡ��ÿ���ַ���������ʽ�ĳ�Ա����
		for(String key : keys){
//			System.out.println(key);
			//ƴ�ӷ�����
			String methodName="set"+key.substring(0, 1).toUpperCase()+key.substring(1);
//			System.out.println(methodName);
			//�����ȡ����
			Method method = c.getMethod(methodName, String.class);
			//����set����
			method.invoke(obj, p.getProperty(key));
		}
		System.out.println(obj);
	}
}
