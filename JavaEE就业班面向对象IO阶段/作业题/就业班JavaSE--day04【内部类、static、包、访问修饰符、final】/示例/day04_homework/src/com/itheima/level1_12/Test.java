package com.itheima.level1_12;
/*
 1.����һ��������(Car)
	a)��Ա����: ״̬(status),true��ʾ����״̬һ��,false��ʾֹͣ״̬.
	b)��Ա�ڲ���: ������(Engine) 
		i.��Ա����:work()
			1.�������������״̬��ӡ�������ͷ�����ת
			2.�����ӡ������ֹͣ����
	c)�ṩ:״̬(status)��getter��setter����
2.���������(Test)
	a)�ṩmain����
	b)��main������
		i.������������ c
		ii.ͨ����������c�����������ķ���������e
		iii.���÷�����e�����work()����
		iv.����������c��״̬����Ϊtrue
		v.���÷�����e�����work()����
	 */
public class Test {
	public static void main(String[] args) {
//		i.������������ c
		Car c = new Car();
//		ii.ͨ����������c�����������ķ���������e
		Car.Engine e = c.new Engine();
//		iii.���÷�����e�����work()����
		e.work();
//		iv.����������c��״̬����Ϊtrue
		c.setStatus(true);
//		v.���÷�����e�����work()����
		e.work();
	}
}
