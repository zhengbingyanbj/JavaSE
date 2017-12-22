package com.itheima.level02_04;
/*
 请用代码描述： 小王卖出一部价值6000的iPhone手机
 
3.定义测试类Test
	a)提供main方法
	b)在main方法中
		i.使用带参构造创建Person对象 p,name初始化为小王
		ii.调用对象p的sellPhone()方法,赋值给Phone phone变量
		iii.在main输出: 小王卖出一部价值6000的iPhone手机
 */
public class Test {
	public static void main(String[] args) {
		
//		i.使用带参构造创建Person对象 p,name初始化为小王
		Person p = new Person("小王");
//		ii.调用对象p的sellPhone()方法,赋值给Phone phone变量
		Phone phone = p.sellPhone();
//		iii.输出: 小王卖出一部价值6000的iPhone手机
		System.out.println(p.getName()+"卖出一部价值"+phone.getPrice()+"的"+phone.getBrand()+"手机");
	}
}
