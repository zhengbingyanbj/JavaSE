package com.itheima.level2_02;
/*
 5.����ѧ����(Student),�̳�����(Person)
	a)��Ա����:�ֳ��󷽷�eat()
		i.�����ʽ: ����18��� Ҷ֪�� �ڳ�ѧ����
	b)�ṩ: �޲�,�вι��췽��
 */
public class Student extends Person{
//a)��Ա����:�ֳ��󷽷�eat()
//	i.�����ʽ: ����18��� Ҷ֪�� �ڳ�ѧ����
	public void eat() {
		System.out.println("����"+getAge()+"��� "+getName()+" �ڳ�ѧ����");
	}
//b)�ṩ: �޲�,�вι��췽��
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super(name, age);
	}
}
