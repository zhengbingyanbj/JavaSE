package com.itheima.level02_03;

/*
 2.��������(Person)
	a)����: ����(name)
	b)��Ϊ: ����: readBook(Book book) 
	c)Ҫ��: �ṩ���ι���
 */
public class Person {
//	����(name)
	private String name;
//	����: readBook(Book book) 
	public void readBook(Book book){
		System.out.println(name+"���ڿ�"+book.getName()+"С˵");
	}
//	���ι���
	public Person(String name) {
		this.name = name;
	}
}
