package com.itheima.level02_03;

/*
  1.��������(Book)
	a)����: ����(name)
	b)Ҫ��: �ṩ���ι���,setXxx��getXxx����
 */
public class Book {
// ����
	private String name;
// ���ι���
	public Book(String name) {
		this.name = name;
	}
//	setXxx��getXxx����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
