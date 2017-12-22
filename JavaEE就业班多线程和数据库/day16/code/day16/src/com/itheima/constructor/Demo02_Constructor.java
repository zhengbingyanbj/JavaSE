package com.itheima.constructor;

import java.lang.reflect.Constructor;

/*
 * ������ι��췽��������
 * 
 * 1.��ȡ�ֽ����ļ�����
 * 2.��ȡ���ι��췽��
 * 		Class��
 * 			Constructor  getConstructor(Class...c) ��ȡָ���Ĺ��췽��
 * 			���� 
 * 				Class...c:Class���͵Ŀɱ���� 
 * 				 ���췽���Ĳ������������� ���������String����  Strin.class
 * 3.���й��췽��
 * 		Constructor��
 * 			Object newInstance(Object...args)
 * 			���� 
 * 				Object...args:Object���Ϳɱ����  ���������й��췽����ʵ�ʲ���
 */
public class Demo02_Constructor {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.itheima.bean.Person");
		//��ȡ���ι��췽��
		Constructor con = c.getConstructor(String.class,int.class);
//		System.out.println(con);
		//���д��ι��췽��
		Object obj = con.newInstance("liuyan",38);//Object obj = new Person("liuyan"��38);
		System.out.println(obj);
	
	}
}
