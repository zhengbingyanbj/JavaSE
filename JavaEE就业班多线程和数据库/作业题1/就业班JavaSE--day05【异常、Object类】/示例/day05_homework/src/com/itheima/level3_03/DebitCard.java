package com.itheima.level3_03;
/*
 3.�����ǿ���(DebitCard)
	a)����: �˺�(accountNumber):�����(money); 
	b)�ṩ�ղι���
	c)�ṩ�в�������
		i.��Ч�ι�����ʹ��setXxx��������Ӧ�ĳ�Ա������ֵ
	d)�ṩsetter��getter����
		i.��setMoney(int money)��
		ii.���moneyΪ����,�׳���Ч�Ľ���쳣UnValidMoneyException
		iii.������Ա����money��ֵ
 */
public class DebitCard {
//	 �˺�(accountNumber)
	private String accountNumber;
//	  ���(money); 
	private int money;
//	b)�ṩ�ղι���
	public DebitCard() {
		super();
	}
//	c)�ṩ�в�������
	public DebitCard(String accountNumber, int money) {
		super();
//	i. ʹ��setXxx��������Ӧ�ĳ�Ա������ֵ
		setAccountNumber(accountNumber);
		setMoney(money);
	}
//	d)�ṩsetter��getter����
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getMoney() {
		return money;
	}
//	i.��setMoney(int money)��
	public void setMoney(int money) {
//	ii.���moneyΪ����,�׳���Ч�Ľ���쳣UnValidMoneyException
		if(money < 0){
			throw new UnValidMoneyException("�����Ч:"+money);
		}
//	iii.������Ա����money��ֵ
		this.money = money;
	}
}
