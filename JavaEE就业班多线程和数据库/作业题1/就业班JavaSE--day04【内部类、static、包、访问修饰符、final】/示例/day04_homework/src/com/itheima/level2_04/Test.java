package com.itheima.level2_04;
/*
 1.���������(Employee)
	a)����: ����(id),����(name)
	b)��Ϊ: ���󷽷�work()
	c)Ҫ��: �ṩsetters��gettters����
2.���������Test
	a)�ṩmain����
	b)��main������
		i.ʹ�������ڲ��ഴ��Employee��������� e;����дwork()����
			1.�����ʽ:����Ϊ001��Ա����������Ŭ�����ô���
		ii.ʹ��setXxx������e�Ĺ��ź����Ƹ�ֵ
		iii.����e��work()����
 */
public class Test {
	public static void main(String[] args) {
//		i.ʹ�������ڲ��ഴ��Employee��������� e;����дwork()����
//			1.�����ʽ:����Ϊ001��Ա����������Ŭ�����ô���
		Employee e = new Employee() {
			public void work() {
				System.out.println("����Ϊ"+getId()+"��Ա��"+getName()+"��Ŭ�����ô���");
			}
		};
//		ii.ʹ��setXxx������e�Ĺ��ź����Ƹ�ֵ
		e.setId("001");
		e.setName("������");
//		iii.����e��work()����
		e.work();
		
	}
}
