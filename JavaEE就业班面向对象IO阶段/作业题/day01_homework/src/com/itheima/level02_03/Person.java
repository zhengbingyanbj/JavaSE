package com.itheima.level02_03;

/*
 2.定义人类(Person)
	a)属性: 名称(name)
	b)行为: 看书: readBook(Book book) 
	c)要求: 提供带参构造
 */
public class Person {
//	名称(name)
	private String name;
//	看书: readBook(Book book) 
	public void readBook(Book book){
		System.out.println(name+"正在看"+book.getName()+"小说");
	}
//	带参构造
	public Person(String name) {
		this.name = name;
	}
}
