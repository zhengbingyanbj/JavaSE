package com.itheima.level03_03;

/*
 1.定义抽象类员工类(Employee)
	a)成员变量: 工号(id),姓名(name)
	b)抽象方法: void work();
	c)提供无参和带参的构造方法以及setters和getters
 */
public abstract class Employee {
//	a)成员变量: 工号(id),姓名(name)
	private String id;
	private String name;
//	b)抽象方法: void work();
	public abstract void work();
//	c)提供无参和带参的构造方法以及setters和getters
	public Employee() {
		super();
	}
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
