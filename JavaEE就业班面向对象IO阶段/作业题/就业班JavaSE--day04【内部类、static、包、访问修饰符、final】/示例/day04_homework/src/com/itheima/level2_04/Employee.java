package com.itheima.level2_04;

/*
  1.���������(Employee)
	a)����: ����(id),����(name)
	b)��Ϊ: ���󷽷�work()
	c)Ҫ��: �ṩsetters��gettters����
 */
public abstract class Employee {
//	����
	private String id;
//	����
	private String name;
	
//	��Ϊ
	public abstract void work();

//	�ṩsetters��gettters����
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
