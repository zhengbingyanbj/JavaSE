package com.itheima.constructor;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

/*
 * ��ȡ�ղι��췽��������
 * 
 * 1.��ȡ�ֽ����ļ�����
 * 2.ͨ���ֽ����ļ������ȡ�ղι��췽��
 * 		Class��
 * 			Constructor[] getConstructors() ��ȡ���еĹ����Ĺ��췽��
 * 			Constructor getConstructor() ��ȡָ���Ĺ��췽�� ����������ȡ�ľ��ǿղι��� 
 * 3.���пղι��췽��
 * 		Constructor����
 * 			 Object newInstance() ���й��췽��
 * 
 */
public class Demo01_Constructor {

	public static void main(String[] args) throws Exception {
		//��ȡ�ֽ����ļ�����
		Class c = Class.forName("com.itheima.bean.Person");
		//��ȡ���й����Ĺ��췽��
//		Constructor[] cons = c.getConstructors();
//		for(Constructor con:cons){
//			System.out.println(con);
//		}
//		
//		Constructor con = cons[0];
		//��ȡ�ղι��췽��
		Constructor con = c.getConstructor();
		//���пղι��췽��
		Object obj = con.newInstance();//Object obj = new Person();
		System.out.println(obj.toString());
		
	
	}
}
