package com.itheima.getclass;

import com.itheima.bean.Person;

/*
 * ��ȡ�ֽ����ļ���������ַ�ʽ
 * 
 * 1.Object���getClass���� 
 * 		Class getClass() 
 * 2.ÿ�����Ͷ��߱�һ�����صľ�̬��class���� ������������
 * 		����.class
 * 3.Class��ľ�̬����
 * 		static Class forName(String className)
 */
public class Demo01_Class {

	public static void main(String[] args) throws ClassNotFoundException {
		//ͨ��Object��getClass����
		Person p = new Person();
		Class c1 = p.getClass();
		System.out.println(c1);
		
		//ͨ����̬class���Ի�ȡ
		Class c2 = Person.class;
		System.out.println(c2);
		System.out.println(c1==c2);
		
		//ͨ��Class��ľ�̬����
		Class c3 = Class.forName("com.itheima.bean.Person");
		System.out.println(c3);
		System.out.println(c1 == c3);
	}
}
