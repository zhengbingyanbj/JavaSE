package com.itheima.level03_03;

/*
 6.����ά��רԱ(Maintainer)��̳�������Ա��(AdminStaff)��
	a)�ṩ�޲κʹ��εĹ��췽��
	b)ʵ�ֳ��󷽷�: void work();
		i.�����ʽ: ����Ϊ 686 ��ά��רԱ �Ҷ� �ڽ�����ܹ�����Ļ����
 */
public class Maintainer extends AdminStaff {
//	a)�ṩ�޲κʹ��εĹ��췽��
	public Maintainer() {
		super();
	}

	public Maintainer(String id, String name) {
		super(id, name);
	}
//	b)ʵ�ֳ��󷽷�: void work();
//	i.�����ʽ: ����Ϊ 686 ��ά��רԱ �Ҷ� �ڽ�����ܹ�����Ļ����
	public void work() {
		System.out.println("����Ϊ "+getId()+" ��ά��רԱ "+getName()+" �ڽ�����ܹ�����Ļ����");
	}

}
