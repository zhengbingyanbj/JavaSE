package com.itheima.level3_03;

/*
 8.�������ݵĲ���Ա����(ActedTreasurer)  �̳� Treasurerʵ�� Actor�ӿ�
	a)ʵ�ֳ��󷽷� play
		i.�����ʽ: ����Ϊ100���в���Ա����˼���ڱ���ħ��
	b)�ṩ�ղ�,���ι��췽��
 */
public class ActedTreasurer extends Treasurer implements Actor{
//a)ʵ�ֳ��󷽷� play
// i.�����ʽ: ����Ϊ100���п�����Ա����˼���ڱ���ħ��
	public void play(){
		System.out.println("����Ϊ"+getId()+"���в���Ա��"+getName()+"�ڱ���ħ��");
	}
//b)�ṩ�ղ�,���ι��췽��
	public ActedTreasurer() {
		super();
	}
	public ActedTreasurer(String id, String name, int salary) {
		super(id, name, salary);
	}
}
