package com.itheima.level03_03;
/*
 3.定义抽象类行政部员工(AdminStaff)类继承员工类(Employee)
	a)提供无参和带参的构造方法
 */
public abstract class AdminStaff extends Employee {
//	a)提供无参和带参的构造方法
	public AdminStaff() {
		super();
	}

	public AdminStaff(String id, String name) {
		super(id, name);
	}
	
}
