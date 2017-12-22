package com.itheima.level03_03;
/*
 7.定义采购专员(Buyer) 类继承行政部员工(AdminStaff)类
	a)提供无参和带参的构造方法
	b)实现抽象方法: void work();
		输出格式:  工号为 888 的采购专员 景甜 在采购音响设备
 */
public class Buyer extends AdminStaff {
//	a)提供无参和带参的构造方法
	public Buyer() {
		super();
	}

	public Buyer(String id, String name) {
		super(id, name);
	}
//	b)实现抽象方法: void work();
//	输出格式:  工号为 888 的采购专员 景甜 在采购音响设备
	public void work() {
		System.out.println("工号为 "+getId()+" 的采购专员 "+getName()+" 在采购音响设备");
	}

}
