package com.itheima.level03_03;

/*
 5.定义助教(Tutor)类继承研部员工（Teacher）类
	a)提供无参和带参的构造方法
	b)实现抽象方法: void work();
		i.输出格式: 工号为 668的助教 顾棋 在帮助学生解决问题
 */
public class Tutor extends Teacher{
//	a)提供无参和带参的构造方法
	public Tutor() {
		super();
	}

	public Tutor(String id, String name) {
		super(id, name);
	}
//	b)实现抽象方法: void work();
//		i.输出格式: 工号为 668的助教 顾棋 在帮助学生解决问题
	public void work() {
		System.out.println("工号为 "+getId()+"的助教 "+getName()+" 在帮助学生解决问题");
	}
}
