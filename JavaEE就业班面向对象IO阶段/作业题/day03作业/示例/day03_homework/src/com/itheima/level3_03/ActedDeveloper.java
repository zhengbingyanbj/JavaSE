package com.itheima.level3_03;

/*
 6.�������ݵĿ�����Ա����(ActedDeveloper)  �̳� Developerʵ�� Actor�ӿ�
	a)ʵ�ֳ��󷽷� play
		i.�����ʽ: ����Ϊ010�Ŀ�����Ա���ֿ����ڳ���
	b)�ṩ�ղ�,���ι��췽��
 */
public class ActedDeveloper extends Developer implements Actor {
//a)ʵ�ֳ��󷽷� play
//	i.�����ʽ: ����Ϊ010���п�����Ա���ֿ����ڳ���
	public void play(){
		System.out.println("����Ϊ"+getId()+"�Ŀ�����Ա��"+getName()+"�ڳ���");
	}
//b)�ṩ�ղ�,���ι��췽��
	public ActedDeveloper() {
		super();
	}
	public ActedDeveloper(String id, String name, int salary) {
		super(id, name, salary);
	}
}
