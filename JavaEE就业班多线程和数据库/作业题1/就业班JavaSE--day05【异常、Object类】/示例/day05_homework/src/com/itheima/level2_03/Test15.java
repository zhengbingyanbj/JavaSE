package com.itheima.level2_03;
/*
 1.�Զ����쳣��NoLifeValueExption�̳�RuntimeException
	a)�ṩ�ղκ��вι���
	b)���вι�����,��Ҫ���ø�����вι���,���쳣��Ϣ����
2.����Person��
	a)����:����(name)������ֵ(lifeValue)
		b)�ṩ�ղι���
		c)�ṩ�вι���;
			i.ʹ��setXxx������name��lifeValue��ֵ
	d)�ṩsetter��getter����
		i.��setLifeValue(int lifeValue)������
			1.�����ж�,��� lifeValueΪ����,���׳�NoLifeValueException,�쳣��ϢΪ:����ֵ����Ϊ����:xxx.
			2.Ȼ���ڸ���ԱlifeValue��ֵ.
3.���������Test15
	a)�ṩmain����,��main������
		i.ʹ�����ι��췽������Person����,��������һ������,���г���
		ii.����һ�������쳣,����Ĵ���Ľ�����ִ��,������Ҫע�͵�����Ĵ���
		iii.ʹ�ÿղι��촴��Person����
		iv.����setLifeValue(int lifeValue)����,����һ������,���г���
		v.����setLifeValue(int lifeValue)����,����һ������,���г���
 */
public class Test15 {
	public static void main(String[] args) {
//		i.ʹ�����ι��췽������Person����,��������һ������,���г���
//		Person p = new Person("��˼��", -100);
//		ii.����һ�������쳣,����Ĵ���Ľ�����ִ��,������Ҫע�͵�����Ĵ���
//		iii.ʹ�ÿղι��촴��Person����
		Person p = new Person();
//		iv.����setLifeValue(int lifeValue)����,����һ������,���г���
		p.setLifeValue(1000);
//		v.����setLifeValue(int lifeValue)����,����һ������,���г���
		p.setLifeValue(-100);
	}
}
