package com.itheima.level02_06;

/*
1.定义动物类(Animal)
	a)成员变量
		i.名称 name
		ii.颜色 color
	b)成员方法
		i.吃  eat()  
		    打印格式: 白色的Tom动物在吃东西
	c)要求:
	    i.成员变量不带权限修饰符,方法是公共权限的.
 */
public class Animal {
//	a)成员变量
//		i.名称 name
	String name;
//		ii.颜色 color
	String color;
//b)成员方法
//	i.吃  eat()  
//    打印格式: 白色的Tom动物在吃东西
	public void eat(){
		System.out.println(color+"的"+name+"动物在吃东西");
	}
}
