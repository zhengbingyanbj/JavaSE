package com.itheima.level03_03;

/*
 2.定义抽象类教研部员工（Teacher）类继承员工类(Employee)
	a)提供无参和带参的构造方法
 */
public abstract class Teacher extends Employee{
//  a)提供无参和带参的构造方法
	public Teacher() {
		super();
	}

	public Teacher(String id, String name) {
		super(id, name);
	}
	
}
