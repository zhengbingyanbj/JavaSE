package com.itheima.level3_03;
/*
 5.���忪����Ա����(Developer)  �̳� Employee
	a)ʵ�ֳ��󷽷�work()
		i.�����ʽ: ����Ϊ010�Ŀ�����Ա���ֿ����ڿ���JavaEEӦ��
	b)�ṩ�ղ�,���ι��췽��
 */
public class Developer extends Employee {
//a)ʵ�ֳ��󷽷�work()
// i.�����ʽ: ����Ϊ010�Ŀ�����Ա���ֿ����ڿ���JavaEEӦ��
	public void work(){
		System.out.println("����Ϊ"+getId()+"�Ŀ�����Ա��"+getName()+"�ڿ���JavaEEӦ��");
	}
//b)�ṩ�ղ�,���ι��췽��
	public Developer() {
		super();
	}
	public Developer(String id, String name, int salary) {
		super(id, name, salary);
	}
}
