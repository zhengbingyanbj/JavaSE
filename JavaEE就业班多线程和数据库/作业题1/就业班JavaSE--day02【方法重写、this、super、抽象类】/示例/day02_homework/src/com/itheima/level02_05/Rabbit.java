package com.itheima.level02_05;

/*
 7.��������(Rabbit)�̳�ʳ�ݶ���(Herbivore)
	a)��дeat()����
		i.�����ʽ: ����Ϊ 1���4���ȵ������ڳԹ�β��
	b)�ṩ�ղκ��вι��췽��
 */
public class Rabbit extends Herbivore {
//a)��дeat()����
//		i.�����ʽ: ����Ϊ 1���4���ȵ������ڳԹ�β��
	public void eat(){
		System.out.println("����Ϊ "+getAge()+"���"+getNumOfLegs()+"���ȵ������ڳԹ�β��");
	}
//b)�ṩ�ղκ��вι��췽��
	public Rabbit() {
		super();
	}

	public Rabbit(int age, int numOfLegs) {
		super(age, numOfLegs);
	}
	
}
