package com.itheima.level3_03;

/*
 7.�������Ա����(Treasurer)  �̳� Employee
	a)ʵ�ֳ��󷽷�work()
		i.�����ʽ: ����Ϊ100 �Ĳ���Ա����˼���ڶ���
	b)�ṩ�ղ�,���ι��췽��
 */
public class Treasurer extends Employee {
//a)ʵ�ֳ��󷽷�work()
//	i.�����ʽ: ����Ϊ100 �Ĳ���Ա����˼���ڶ���
	public void work(){
		System.out.println("����Ϊ"+getId()+" �Ĳ���Ա��"+getName()+"�ڶ���");
	}
//	b)�ṩ�ղ�,���ι��췽��
	public Treasurer() {
		super();
	}
	public Treasurer(String id, String name, int salary) {
		super(id, name, salary);
	}
}
