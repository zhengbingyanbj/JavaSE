package com.itheima.level3_03;

/*
 6.定义会表演的开发部员工类(ActedDeveloper)  继承 Developer实现 Actor接口
	a)实现抽象方法 play
		i.输出格式: 工号为010的开发部员工林俊杰在唱歌
	b)提供空参,带参构造方法
 */
public class ActedDeveloper extends Developer implements Actor {
//a)实现抽象方法 play
//	i.输出格式: 工号为010的行开发部员工林俊杰在唱歌
	public void play(){
		System.out.println("工号为"+getId()+"的开发部员工"+getName()+"在唱歌");
	}
//b)提供空参,带参构造方法
	public ActedDeveloper() {
		super();
	}
	public ActedDeveloper(String id, String name, int salary) {
		super(id, name, salary);
	}
}
