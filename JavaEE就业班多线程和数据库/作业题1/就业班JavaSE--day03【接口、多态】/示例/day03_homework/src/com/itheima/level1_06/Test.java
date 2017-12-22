package com.itheima.level1_06;
/*
1.����µϳ���(Audi)
	a)��Ա����: ��(run())
		i.�����ʽ: �µϳ�����
2.�������ܽӿ�(Smart)
	a)���󷽷�: �Զ�����(automaticParking)�����˼�ʻ(automaticDrive)
3.�������ܰµϳ���(SmartAudi) �̳�Audiʵ��Smart�ӿ�
	a)��Ա����
	i.ʵ��automaticParking����
		1.���:���ܰµϳ����Զ�����
	ii.ʵ��automaticDrive����
		1.���:���ܰµϳ������˼�ʻ
4.���������Test
	a)�ṩmain����
	b)��main������
		i.����Audi������ a,�����ܷ���
		ii.����SmartAudi������ sa,������,�Զ�����,�Զ���ʻ����
		iii.����Audi���͵ı��� aa ��sa��ֵaa; ����aaֻ�ܵ���run����,���ܵ�����������
		iv.�ж����aa��SmartAudi��ʵ������, ��aaǿ��ת��Ϊsaa;ʹ��saa�����Զ��������Զ���ʻ����
		v.����Smart���͵ı��� s,��sa��ֵ��s,����ֻ�ܵ����Զ��������Զ���ʻ����,���ܵ���run����.
 */
public class Test {
	public static void main(String[] args) {
//		i.����Audi������ a,�����ܷ���
		Audi a = new Audi();
		a.run();
//		ii.����SmartAudi������ sa,������,�Զ�����,�Զ���ʻ����
		SmartAudi sa = new SmartAudi();
		sa.run();
		sa.automaticParking();
		sa.automaticDrive();
//		iii.����Audi���͵ı��� aa ��sa��ֵaa; ����aaֻ�ܵ���run����,���ܵ�����������
		Audi aa = sa;
		aa.run();
//		aa.automaticParking(); ���뱨��
//		aa.automaticDrive();   ���뱨��
//		iv.�ж����aa��SmartAudi��ʵ������, ��aaǿ��ת��Ϊsaa;ʹ��saa�����Զ��������Զ���ʻ����
		if(aa instanceof SmartAudi){
			SmartAudi saa = (SmartAudi) aa;
			saa.automaticParking();
			saa.automaticDrive();
		}
//		v.����Smart���͵ı��� s,��sa��ֵ��s,����ֻ�ܵ����Զ��������Զ���ʻ����,���ܵ���run����.
		Smart s = sa;
		s.automaticDrive();
		s.automaticParking();
//		s.run(); ���뱨��
	}
}
