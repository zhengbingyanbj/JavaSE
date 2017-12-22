package com.itheima.method;

import java.lang.reflect.Method;

import com.itheima.bean.Person;

/*
 * �����ȡget/set����������
 * 
 * 1.��ȡ�ֽ����ļ�����
 * 2.ͨ���ֽ����ļ����� ��ȡget/set����
 * 		Class�� 
 * 			Method[] getMethods() ���й����ķ��� �����̳�
 * 			Method getMethod(String methodName,Class...c) ��ȡָ���Ĺ��췽��
 * 			���� 
 * 				String methodName ������ 
 * 				Class...c:�����Ĳ������������� �����String����  String.class
 * 
 * 3.����get/set����
 *		Method��ķ���
 *			 Object invoke(Object obj, Object... args)  ִ�з���
 *			 ����ֵ 
 *				Object���������еķ���ֵ �еķ���û�з���ֵ  ����null 
 *			����  
 *				Object obj:���з����Ķ��� 
 *				 Object... args:���з�����Ҫ���ݵ�ʵ�ʲ���
 *		
 */
public class Demo01_Method {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itheima.bean.Person");
		//��ȡ���й����ķ���
//		Method[] methods = c.getMethods();
//		//�������� ���λ�ȡÿ����������
//		for (Method method : methods) {
//			System.out.println(method);
//		}
		//��ȡsetAge����
		Method setAgeMethod = c.getMethod("setAge", int.class);
//		System.out.println(setAgeMethod);
		
		//����setAge����
//		Person p = new Person();
		//��ݷ�ʽ��������
		Object obj = c.newInstance();
		setAgeMethod.invoke(obj,38);
		System.out.println(obj);
		
		//��ȡgetAge���� 
		Method getAgeMethod = c.getMethod("getAge");
		Object age = getAgeMethod.invoke(obj);
		System.out.println(age);
		
	}
}
