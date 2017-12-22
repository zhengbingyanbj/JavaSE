package com.itheima.level02_03;
/*
 请用代码描述古力娜扎正在看择天记小说

3.定义测试类Test
	a)提供main方法
	b)在main方法中
		i.使用带参构造创建Person对象,name初始化为古力娜扎
		ii.使用该匿名对象,调用readBook(Book book) 方法，使用Book的带参构造创建Book对象,把名称初始化为择天记,把Book的匿名对象作为参数readBook(Book book)方法
	c)输出格式
		i.古力娜扎正在看择天记小说
 
 */
public class Test {
	
	public static void main(String[] args) {
//		i.使用带参构造创建Person对象,name初始化为古力娜扎
//		ii.使用该匿名对象,调用readBook(Book book) 方法，
//		       使用Book的带参构造创建Book对象,把名称初始化为择天记,
//		        把Book的匿名对象作为参数传入readBook(Book book)方法
		new Person("古力娜扎").readBook(new Book("择天记"));
	}
}
