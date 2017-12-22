package com.itheima.level3_03;
/*
 1.�������Ա����(Employee)
	a)����:����(id),����(name)�͹���(salary)
	b)���󷽷� (work)
	c)�ṩ�ղ�,���ι��췽����setters,getters����
 */
public abstract class Employee {
//	a)����:����(id),����(name)�͹���(salary)
	private String id;
	private String name;
	private int salary;
//	b)���󷽷� (work)
	public abstract void work();
//	c)�ṩ�ղ�,���ι��췽����setters,getters����
	public Employee() {
		super();
	}
	public Employee(String id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
