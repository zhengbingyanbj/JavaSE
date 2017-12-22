package com.itheima.level2_04;

/*
  1.定义抽象类(Employee)
	a)属性: 工号(id),姓名(name)
	b)行为: 抽象方法work()
	c)要求: 提供setters和gettters方法
 */
public abstract class Employee {
//	工号
	private String id;
//	姓名
	private String name;
	
//	行为
	public abstract void work();

//	提供setters和gettters方法
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
