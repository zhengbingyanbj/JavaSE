package com.itheima.level03_01;

/*
   2. �����ˣ�Person����
  	 1. ���ԣ� ���ƣ�name��,���䣨age��
     2. ��Ϊ�� ϴ�·�,���·�������Ϊ��������
     	�����ʽΪ�� 18���ŷ����������ϴһ����ɫ��LiNing�Ƶ��·�
     3. �ṩ�����ι��췽��
 */
public class Person {
//	����
	private String name;
//	����
	private int age;
	
//	ϴ�·�
	public void wash(Clothes c){
		System.out.println(age+"���"+name+"����ϴһ��"+c.getColor()+"��"+c.getBrand()+"�Ƶ��·�");
	}

//	���ι���
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
