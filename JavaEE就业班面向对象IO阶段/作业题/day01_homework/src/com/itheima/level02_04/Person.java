package com.itheima.level02_04;

/*
 2.定义人类(Person)
	a)属性: 名称(name)
	b)行为:  卖手机: Phone sellPhone() ,在方法内部使用匿名对象作为返回值 
	c)要求: 提供带参构造,setXxx和getXxx方法
 */
public class Person {
//	名称
	private String name;
	
//	卖手机: Phone sellPhone() ,在方法内部使用匿名对象作为返回值 
	public Phone sellPhone(){
		return new Phone("iPhone", 6000);
	}
// 带参构造
	public Person(String name) {
		this.name = name;
	}
// setXxx和getXxx方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
