package com.itheima.level02_05;

/*
 5.������ľ��(Pecker)�̳�ʳ���ද��(Carnivore)
	a)��дeat()����
		i.�����ʽ: ����Ϊ 1���2���ȵ���ľ����ڳ�����
	b)�ṩ�ղκ��вι��췽��
 */
public class Pecker extends Carnivore {
//a)��дeat()����
//	i.�����ʽ: ����Ϊ 1���2���ȵ���ľ����ڳ�����
	public void eat(){
		System.out.println("����Ϊ "+getAge()+"���"+getNumOfLegs()+"���ȵ���ľ����ڳ�����");
	}
//b)�ṩ�ղκ��вι��췽��
	public Pecker() {
		super();
	}

	public Pecker(int age, int numOfLegs) {
		super(age, numOfLegs);
	}
}
