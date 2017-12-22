package com.itheima.level03_03;

/*
 4.定义讲师(Lecturer)类继承研部员工（Teacher）类
	a)提供无参和带参的构造方法
	b)实现抽象方法: void work();
		输出格式: 工号为 666 的讲师 傅红雪 在讲课
 */
public class Lecturer extends Teacher {
//	a)提供无参和带参的构造方法
	public Lecturer() {
		super();
	}
	public Lecturer(String id, String name) {
		super(id, name);
	}
	
//	b)实现抽象方法: void work();
//		输出格式: 工号为 666 的讲师 傅红雪 在讲课
	public void work() {
		System.out.println("工号为 "+getId()+" 的讲师 "+getName()+" 在讲课");
	}



}
