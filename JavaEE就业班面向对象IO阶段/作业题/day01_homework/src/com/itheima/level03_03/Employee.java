package com.itheima.level03_03;

/*
1. ����Employee��
	1. ���ԣ� ���ƣ�name,���� age
    2. ��Ϊ�� ˵����say��
                          �����ʽ�� 18���Ա��������˵��
	3. Ҫ�� ��Ա��������Ȩ��private 
 */
public class Employee {
//	���ƣ�name
	String name;
//	���� age
	int age;
//	˵����say��
	public void say(){
		System.out.println(age+"���Ա��"+name+"��˵��");
	}
}
