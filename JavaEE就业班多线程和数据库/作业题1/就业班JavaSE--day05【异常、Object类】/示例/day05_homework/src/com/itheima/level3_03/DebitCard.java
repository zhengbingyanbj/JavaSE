package com.itheima.level3_03;
/*
 3.定义借记卡类(DebitCard)
	a)属性: 账号(accountNumber):和余额(money); 
	b)提供空参构造
	c)提供有参数构造
		i.有效参构造需使用setXxx方法给对应的成员变量赋值
	d)提供setter和getter方法
		i.在setMoney(int money)中
		ii.如果money为负数,抛出无效的金额异常UnValidMoneyException
		iii.最后给成员变量money赋值
 */
public class DebitCard {
//	 账号(accountNumber)
	private String accountNumber;
//	  余额(money); 
	private int money;
//	b)提供空参构造
	public DebitCard() {
		super();
	}
//	c)提供有参数构造
	public DebitCard(String accountNumber, int money) {
		super();
//	i. 使用setXxx方法给对应的成员变量赋值
		setAccountNumber(accountNumber);
		setMoney(money);
	}
//	d)提供setter和getter方法
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getMoney() {
		return money;
	}
//	i.在setMoney(int money)中
	public void setMoney(int money) {
//	ii.如果money为负数,抛出无效的金额异常UnValidMoneyException
		if(money < 0){
			throw new UnValidMoneyException("余额无效:"+money);
		}
//	iii.最后给成员变量money赋值
		this.money = money;
	}
}
