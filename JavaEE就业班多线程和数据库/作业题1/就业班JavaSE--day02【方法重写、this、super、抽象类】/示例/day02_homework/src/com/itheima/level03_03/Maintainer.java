package com.itheima.level03_03;

/*
 6.定义维护专员(Maintainer)类继承行政部员工(AdminStaff)类
	a)提供无参和带参的构造方法
	b)实现抽象方法: void work();
		i.输出格式: 工号为 686 的维护专员 庖丁 在解决不能共享屏幕问题
 */
public class Maintainer extends AdminStaff {
//	a)提供无参和带参的构造方法
	public Maintainer() {
		super();
	}

	public Maintainer(String id, String name) {
		super(id, name);
	}
//	b)实现抽象方法: void work();
//	i.输出格式: 工号为 686 的维护专员 庖丁 在解决不能共享屏幕问题
	public void work() {
		System.out.println("工号为 "+getId()+" 的维护专员 "+getName()+" 在解决不能共享屏幕问题");
	}

}
