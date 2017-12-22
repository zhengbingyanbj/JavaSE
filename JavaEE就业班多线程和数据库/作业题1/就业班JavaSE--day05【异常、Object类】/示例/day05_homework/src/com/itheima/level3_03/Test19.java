package com.itheima.level3_03;
/*
 请使用代码描述: 
每一张借记卡(DebitCard)都有账号(accountNumber):和余额(money); 余额永远不能为负数
要求:当借记卡的余额为负数的时候需要抛出自定的异常

1.创建包:com.itheima.level3_03
2.定义异常类无效金额异常(UnValidMoneyException),继承RuntimeExpetion
	a)提供无参构造和有参构造
3.定义借记卡类(DebitCard)
	a)属性: 账号(accountNumber):和余额(money); 
	b)提供空参构造
	c)提供有参数构造
		i.有参构造需使用setXxx方法给对应的成员变量赋值
	d)提供setter和getter方法
		i.在setMoney(int money)中
		ii.如果money为负数,抛出无效的金额异常UnValidMoneyException
		iii.最后给成员变量money赋值
4.定义Test19类,提供main方法,在main方法中
	a)使用有参构造创建,创建DebitCard对象,金额传入一个负数
	b)运行测试,注释代码
	c)使用空参构造创建DebitCard的对象 dc
	d)使用setMoney方法传入一个大于0的数,运行程序
	e)使用setMoney方法传入一个小于0的数,运行程序
 */
public class Test19 {
	public static void main(String[] args) {
//		a)使用有参构造创建,创建DebitCard对象,金额传入一个负数
//		DebitCard dc = new DebitCard("001", -100);
//		b)运行测试,注释代码
//		c)使用空参构造创建DebitCard的对象 dc
		DebitCard dc = new DebitCard();
//		d)使用setMoney方法传入一个大于0的数,运行程序
		dc.setMoney(100);
//		e)使用setMoney方法传入一个小于0的数,运行程序
		dc.setMoney(-1);
	}
}
