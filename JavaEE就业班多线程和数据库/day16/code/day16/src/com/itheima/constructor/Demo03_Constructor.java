package com.itheima.constructor;

import java.lang.reflect.Constructor;

/*
 * ����˽�еĹ��췽��������
 * �������� (���Ƽ�ʹ��)
 * 
 * 1.��ȡ�ֽ����ļ�����
 * 2.ͨ���ֽ����ļ������ȡ˽�еĹ��췽��
 * 		Class��ķ���
 * 			 Constructor[] getDeclaredConstructors() ��ȡ���й��췽������˽��
 * 			 Constructor getDeclaredConstructor(Class...parameterTypes) 
 * 			 ��ȡָ���Ĺ��췽�� ���Ի�ȡ˽��
 * 
 * 3.ȡ������Ȩ�޼��
 * 		AccessibleObject��
 * 			 void setAccessible(boolean flag) 
 * 			  flagֵΪtrue��ȡ�����

 * 3.���й��췽��
 * 
 */
public class Demo03_Constructor {

	public static void main(String[] args) throws Exception {
		Class c =Class.forName("com.itheima.bean.Person");
		//��ȡ���й��췽��
//		Constructor[] cons = c.getDeclaredConstructors();
//		for (Constructor con : cons) {
//			System.out.println(con);
//		}
		//��ȡָ����˽�еĹ��췽��
		Constructor con = c.getDeclaredConstructor(String.class);
//		System.out.println(con);
		
		//ȡ�����
		con.setAccessible(true);
		//���й��췽��
		Object obj = con.newInstance("tangyan");
		System.out.println(obj);
	}
}
