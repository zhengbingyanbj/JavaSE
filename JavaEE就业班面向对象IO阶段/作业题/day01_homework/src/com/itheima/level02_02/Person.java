package com.itheima.level02_02;

/*
 1.����Person��
	a)����: ����(name)
	b)��Ϊ: ����(void sing(String song))
	c)Ҫ�� �ṩ���ι��췽��
 */
public class Person {
//	����
	private String name;
// ��Ա����������
	public void sing(String song){
		System.out.println(name+"�����ݳ�"+name+"����");
	}
//	���ι���
	public Person(String name) {
		this.name = name;
	}
}
