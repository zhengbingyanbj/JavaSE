package com.itheima.level02_03;
/*
 ���ô������������������ڿ������С˵

3.���������Test
	a)�ṩmain����
	b)��main������
		i.ʹ�ô��ι��촴��Person����,name��ʼ��Ϊ��������
		ii.ʹ�ø���������,����readBook(Book book) ������ʹ��Book�Ĵ��ι��촴��Book����,�����Ƴ�ʼ��Ϊ�����,��Book������������Ϊ����readBook(Book book)����
	c)�����ʽ
		i.�����������ڿ������С˵
 
 */
public class Test {
	
	public static void main(String[] args) {
//		i.ʹ�ô��ι��촴��Person����,name��ʼ��Ϊ��������
//		ii.ʹ�ø���������,����readBook(Book book) ������
//		       ʹ��Book�Ĵ��ι��촴��Book����,�����Ƴ�ʼ��Ϊ�����,
//		        ��Book������������Ϊ��������readBook(Book book)����
		new Person("��������").readBook(new Book("�����"));
	}
}
