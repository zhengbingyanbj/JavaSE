package com.itheima.level02_02;

/*
 1.定义Person类
	a)属性: 姓名(name)
	b)行为: 唱歌(void sing(String song))
	c)要求： 提供带参构造方法
 */
public class Person {
//	姓名
	private String name;
// 成员方法：唱歌
	public void sing(String song){
		System.out.println(name+"正在演唱"+name+"歌曲");
	}
//	带参构造
	public Person(String name) {
		this.name = name;
	}
}
