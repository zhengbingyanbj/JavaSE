package com.itheima.level02_05;
/*
 6.���峤��¹(Giraffe)�̳�ʳ�ݶ���(Herbivore)
	a)��дeat()����
		i.�����ʽ: ����Ϊ 3 ���4���ȵĳ���¹�ڳ���Ҷ
	b)�ṩ�ղκ��вι��췽��
 */
public class Giraffe extends Herbivore {
//a)��дeat()����
//		i.�����ʽ: ����Ϊ 3 ���4���ȵĳ���¹�ڳ���Ҷ
	public void eat(){
//		�����з���û�б���д����ĳ�Ա����: ����ֱ�ӵ���,this.������(ʵ�ʲ����б�)����,Ҳ����super.������(ʵ�ʲ����б�)����
		System.out.println("����Ϊ "+this.getAge()+" ���"+super.getNumOfLegs()+"���ȵĳ���¹�ڳ���Ҷ");
	}
//b)�ṩ�ղκ��вι��췽��
	public Giraffe() {
		super();
	}

	public Giraffe(int age, int numOfLegs) {
		super(age, numOfLegs);
	}
}
