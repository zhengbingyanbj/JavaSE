package com.itheima.level3_03;

/*
 4.�������ݵ�������Ա����(ActedAdminStaff)  �̳� AdminStaff ʵ�� Actor�ӿ�
	a)ʵ�ֳ��󷽷� play
		i.�����ʽ: ����Ϊ001��������Ա������������
	b)�ṩ�ղ�,���ι��췽��
 */
public class ActedAdminStaff extends AdminStaff implements Actor {
//a)ʵ�ֳ��󷽷� play
//	i.�����ʽ: ����Ϊ001��������Ա������������
	public void play(){
		System.out.println("����Ϊ"+getId()+"��������Ա��"+getName()+"������");
	}
//b)�ṩ�ղ�,���ι��췽��
	public ActedAdminStaff() {
		super();
	}
	
	public ActedAdminStaff(String id, String name, int salary) {
		super(id, name, salary);
	}
}
