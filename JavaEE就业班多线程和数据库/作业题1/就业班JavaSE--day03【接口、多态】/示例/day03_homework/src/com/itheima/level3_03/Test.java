package com.itheima.level3_03;
/*
  ���ô�������
��ĳ����˾ÿһ��Ա�����й���(id),����(name)�͹���(salary),��Ҫ����(work). ���������������ݲ�ͬ��Ϊ������(AdminStaff),������(Developer)�Ͳ���(Treasurer)
������������Ա��Ҫ����(�ɹ�),�����е�������Ա�������(play)(����)
���еĿ�������Ա��Ҫ����(���),���п�����Ա�������(play)(����)
���еĲ�����Ա��Ҫ����(����),�����еĲ���Ա������(play)(��ħ��)
    35���Ѧ֮ǫ�ϰ���ð���Ա����������֯Ա������.


1.�������Ա����(Employee)
	a)����:����(id),����(name)�͹���(salary)
	b)���󷽷� (work)
	c)�ṩ�ղ�,���ι��췽����setters,getters����
2.������ݽӿ�(Actor)
	a)���󷽷�:play() 
3.����������Ա����(AdminStaff)  �̳� Employee
	a)ʵ�ֳ��󷽷�work()
		i.�����ʽ: ����Ϊ001��������Ա�������ڲɹ���Ʒ
	b)�ṩ�ղ�,���ι��췽��
4.�������ݵ�������Ա����(ActedAdminStaff)  �̳� AdminStaff ʵ�� Actor�ӿ�
	a)ʵ�ֳ��󷽷� play
		i.�����ʽ: ����Ϊ001��������Ա������������
	b)�ṩ�ղ�,���ι��췽��
5.���忪����Ա����(Developer)  �̳� Employee
	a)ʵ�ֳ��󷽷�work()
		i.�����ʽ: ����Ϊ010�Ŀ�����Ա���ֿ����ڿ���JavaEEӦ��
	b)�ṩ�ղ�,���ι��췽��
6.�������ݵĿ�����Ա����(ActedDeveloper)  �̳� Developerʵ�� Actor�ӿ�
	a)ʵ�ֳ��󷽷� play
		i.�����ʽ: ����Ϊ010�Ŀ�����Ա���ֿ����ڳ���
	b)�ṩ�ղ�,���ι��췽��
7.�������Ա����(Treasurer)  �̳� Employee
	a)ʵ�ֳ��󷽷�work()
		i.�����ʽ: ����Ϊ100 �Ĳ���Ա����˼���ڶ���
	b)�ṩ�ղ�,���ι��췽��
8.�������ݵĲ���Ա����(ActedTreasurer)  �̳� Treasurerʵ�� Actor�ӿ�
	a)ʵ�ֳ��󷽷� play
		i.�����ʽ: ����Ϊ100���в���Ա����˼���ڱ���ħ��
	b)�ṩ�ղ�,���ι��췽��
9.�ϰ���Boss��
	a)����: ����,����
	b)��Ϊ: 
		i.���Ź���(letWork(Employee e)
			1.����e����Ĺ�������
		ii.��֯����(letPlay(Actor a)
			1.����a�����,���ݷ���.
	c) �ṩ�ղ�,���ι��췽��;setters��getters����
10.������Test
	a)�ṩmain����
	b)��main������
		i.��������ݵ�������Ա����(ActedAdminStaff)���� aas,���Ÿ�ֵΪ001,������ֵΪ����,���ʸ�ֵ5000
		ii.��������ݵĿ�����Ա����(ActedDeveloper) ����ad,���Ÿ�ֵΪ010,������ֵΪ�ֿ���,���ʸ�ֵΪ10000
		iii.��������ݵĲ���Ա����(ActedTreasurer) ���� at,���Ÿ�ֵΪ100,������ֵΪ��˼��,���ʸ�ֵΪ8000
		iv.�����ϰ�(Boss)����,������ֵΪѦ֮ǫ,���丳ֵΪ30
		1.��������letWork(Employee e)����,�ֱ���ass,ad,at
		2.��������letPlayo(Actor a)����,�ֱ���ass,ad,at
 */
public class Test {
	public static void main(String[] args) {		
//	i.��������ݵ�������Ա����(ActedAdminStaff)���� aas,���Ÿ�ֵΪ001,������ֵΪ����,���ʸ�ֵ5000
		ActedAdminStaff aas = new ActedAdminStaff("001", "����", 5000);
//	ii.��������ݵĿ�����Ա����(ActedDeveloper) ����ad,���Ÿ�ֵΪ010,������ֵΪ�ֿ���,���ʸ�ֵΪ10000
		ActedDeveloper ad = new ActedDeveloper();
		ad.setId("010");
		ad.setName("�ֿ���");
		ad.setSalary(10000);
//	iii.��������ݵĲ���Ա����(ActedTreasurer) ���� at,���Ÿ�ֵΪ100,������ֵΪ��˼��,���ʸ�ֵΪ8000
		ActedTreasurer at = new ActedTreasurer("100", "��˼��", 8000);
//	iv.�����ϰ�(Boss)����,������ֵΪѦ֮ǫ,���丳ֵΪ30
		Boss b = new Boss("Ѧ֮ǫ", 30);
//	1.��������letWork(Employee e)����,�ֱ���aas,ad,at
		b.letWork(aas);
		b.letWork(ad);
		b.letWork(at);
//	2.��������letPlayo(Actor a)����,�ֱ���aas,ad,at
		b.letPlay(aas);
		b.letPlay(ad);
		b.letPlay(at);
	}
}
