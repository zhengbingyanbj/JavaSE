package com.itheima.level3_03;

/*
 3.����������Ա����(AdminStaff)  �̳� Employee
	a)ʵ�ֳ��󷽷�work()
		i.�����ʽ: ����Ϊ001��������Ա�������ڲɹ���Ʒ
	b)�ṩ�ղ�,���ι��췽��
 */
public class AdminStaff extends Employee {
//a)ʵ�ֳ��󷽷�work()
//	i.�����ʽ: ����Ϊ001��������Ա�������ڲɹ���Ʒ
	public void work(){
		System.out.println("����Ϊ"+getId()+"��������Ա��"+getName()+"�ڲɹ���Ʒ");
	}
//b)�ṩ�ղ�,���ι��췽��
	public AdminStaff() {
		super();
	}
	public AdminStaff(String id, String name, int salary) {
		super(id, name, salary);
	}
}
