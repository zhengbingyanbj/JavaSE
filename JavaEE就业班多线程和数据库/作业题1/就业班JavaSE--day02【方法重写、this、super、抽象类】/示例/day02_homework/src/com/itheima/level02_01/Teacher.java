package com.itheima.level02_01;
/*
 2.������ʦ��(Teacher),�̳�Person��
	i.��Ա����:  salary(����)
	ii.��Ա����:
		1. ��д����� eat()����
			a)���: ����Ϊ8000Ԫ��30�����Сƽ��ʦ�ڳԹ�����
		2. ���з���:  lecture() ���η���
			a)���: ����Ϊ8000Ԫ��30�����Сƽ��ʦ�ڽ���
	iii.�ṩ�ղκʹ��ι��췽��
	iv.�ṩsetXxx��getXxx����
 */
public class Teacher extends Person {
//    salary(����)
	private int salary;
	
//	��д����� eat()����
	public void eat() {
		System.out.println("����Ϊ"+salary+"Ԫ��"+getAge()+"���"+getName()+"��ʦ�ڳԹ�����");
	}
//	lecture() ���η���
	public void lecture(){
		System.out.println("����Ϊ"+salary+"Ԫ��"+getAge()+"���"+getName()+"��ʦ�ڽ���");
	}
	
//	�ղι���
	public Teacher() {
//		û��д��Ĭ���ṩһ��super();
	}
	//	���ι��췽��
	public Teacher(String name,int age, int salary) {
		super(name,age);
		this.salary = salary;
	}
	
//	�ṩsetXxx��getXxx����
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
