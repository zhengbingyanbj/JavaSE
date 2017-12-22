package com.itheima.level02_03;

/*
  1.定义书类(Book)
	a)属性: 名称(name)
	b)要求: 提供带参构造,setXxx与getXxx方法
 */
public class Book {
// 名称
	private String name;
// 带参构造
	public Book(String name) {
		this.name = name;
	}
//	setXxx与getXxx方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
