package com.itheima.test01;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * ��һ���洢����ΪInteger���͵ļ��������String���͵�����
 * 
 * ����:java�еķ��ͽ���α���� ����ʱ���� ������ʱ ���;Ͳ�������
 */
public class Test {

	public static void main(String[] args) throws Exception, SecurityException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
//		list.add("abc");
		
		//��ȡArrayList���ֽ����ļ�����
		Class c  = list.getClass();
		//��ȡadd����
		Method addMethod = c.getMethod("add", Object.class);
		//����add���� 
		addMethod.invoke(list, "abc");
		addMethod.invoke(list, "abcd");
		addMethod.invoke(list, true);
		
		System.out.println(list);
	}
}
