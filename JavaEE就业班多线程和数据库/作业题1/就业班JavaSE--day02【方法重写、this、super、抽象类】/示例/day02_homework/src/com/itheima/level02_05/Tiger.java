package com.itheima.level02_05;
/*
 4.�����ϻ���(Tiger)�̳�ʳ���ද��(Carnivore)
	a)��дeat()����
		i.�����ʽ: ����Ϊ 2��4���ȵ��ϻ��ڳ���
	b)�ṩ�ղκ��вι��췽��
 */
public class Tiger extends Carnivore {

//	a)��дeat()����
//		i.�����ʽ: ����Ϊ 2��4���ȵ��ϻ��ڳ���
	public void eat() {
		System.out.println("����Ϊ "+getAge()+"��"+getNumOfLegs()+"���ȵ��ϻ��ڳ���");
	}
//	b)�ṩ�ղκ��вι��췽��
	public Tiger() {
		super();
	}

	public Tiger(int age, int numOfLegs) {
		super(age, numOfLegs);
	}
}
