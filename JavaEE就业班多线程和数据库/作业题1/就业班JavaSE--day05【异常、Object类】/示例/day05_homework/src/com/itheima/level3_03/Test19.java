package com.itheima.level3_03;
/*
 ��ʹ�ô�������: 
ÿһ�Ž�ǿ�(DebitCard)�����˺�(accountNumber):�����(money); �����Զ����Ϊ����
Ҫ��:����ǿ������Ϊ������ʱ����Ҫ�׳��Զ����쳣

1.������:com.itheima.level3_03
2.�����쳣����Ч����쳣(UnValidMoneyException),�̳�RuntimeExpetion
	a)�ṩ�޲ι�����вι���
3.�����ǿ���(DebitCard)
	a)����: �˺�(accountNumber):�����(money); 
	b)�ṩ�ղι���
	c)�ṩ�в�������
		i.�вι�����ʹ��setXxx��������Ӧ�ĳ�Ա������ֵ
	d)�ṩsetter��getter����
		i.��setMoney(int money)��
		ii.���moneyΪ����,�׳���Ч�Ľ���쳣UnValidMoneyException
		iii.������Ա����money��ֵ
4.����Test19��,�ṩmain����,��main������
	a)ʹ���вι��촴��,����DebitCard����,����һ������
	b)���в���,ע�ʹ���
	c)ʹ�ÿղι��촴��DebitCard�Ķ��� dc
	d)ʹ��setMoney��������һ������0����,���г���
	e)ʹ��setMoney��������һ��С��0����,���г���
 */
public class Test19 {
	public static void main(String[] args) {
//		a)ʹ���вι��촴��,����DebitCard����,����һ������
//		DebitCard dc = new DebitCard("001", -100);
//		b)���в���,ע�ʹ���
//		c)ʹ�ÿղι��촴��DebitCard�Ķ��� dc
		DebitCard dc = new DebitCard();
//		d)ʹ��setMoney��������һ������0����,���г���
		dc.setMoney(100);
//		e)ʹ��setMoney��������һ��С��0����,���г���
		dc.setMoney(-1);
	}
}
