package com.itheima.level02_05;
/*
请使用代码描述： 38岁的白百合有一部价值为8000元的iPhone的手机,她在使用者部手机给羽凡打电话
  
3.定义测试类Test
	a)提供main方法
	b)在main方法中
		i.使用带参构造创建手机对象 phone,品牌初始化为iPhone,价格初始化为8000
		ii.使用无参构造创建Person对象 yuFan,调用setName(String name)方法,把名称设置为羽凡
		iii.使用带参构造创建Person对象 baiBaiHe,名称初始化为白百合,年龄初始化为38,手机初始化,上面创建的phone对象
		iv.baiBaiHe对象,调用call(Person p) 方法,传入yuFan对象
		1.输出格式:  38岁的白百合使用8000元的iPhone的手机给羽凡打电话
 */
public class Test {
	public static void main(String[] args) {
//		i.使用带参构造创建手机对象 phone,品牌初始化为iPhone,价格初始化为8000
		Phone phone = new Phone("iPhone", 8000);
//		ii.使用无参构造创建Person对象 yuFan,调用setName(String name)方法,把名称设置为羽凡
		Person yuFan = new Person();
		yuFan.setName("羽凡");
//		iii.使用带参构造创建Person对象 baiBaiHe,名称初始化为白百合,年龄初始化为38,手机初始化,上面创建的phone对象
		Person baiBaiHe = new Person("白百合", 38, phone);
//		iv.baiBaiHe对象,调用call(Person p) 方法,传入yuFan对象
		baiBaiHe.callTo(yuFan);
//		1.输出格式:  38岁的白百合使用8000元的iPhone的手机给羽凡打电话
	}
}
