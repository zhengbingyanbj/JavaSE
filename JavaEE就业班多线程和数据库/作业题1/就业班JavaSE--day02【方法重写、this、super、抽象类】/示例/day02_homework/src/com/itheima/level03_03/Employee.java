package com.itheima.level03_03;

/*
 1.���������Ա����(Employee)
	a)��Ա����: ����(id),����(name)
	b)���󷽷�: void work();
	c)�ṩ�޲κʹ��εĹ��췽���Լ�setters��getters
 */
public abstract class Employee {
//	a)��Ա����: ����(id),����(name)
	private String id;
	private String name;
//	b)���󷽷�: void work();
	public abstract void work();
//	c)�ṩ�޲κʹ��εĹ��췽���Լ�setters��getters
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
