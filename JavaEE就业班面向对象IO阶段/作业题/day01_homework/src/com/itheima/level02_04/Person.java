package com.itheima.level02_04;

/*
 2.��������(Person)
	a)����: ����(name)
	b)��Ϊ:  ���ֻ�: Phone sellPhone() ,�ڷ����ڲ�ʹ������������Ϊ����ֵ 
	c)Ҫ��: �ṩ���ι���,setXxx��getXxx����
 */
public class Person {
//	����
	private String name;
	
//	���ֻ�: Phone sellPhone() ,�ڷ����ڲ�ʹ������������Ϊ����ֵ 
	public Phone sellPhone(){
		return new Phone("iPhone", 6000);
	}
// ���ι���
	public Person(String name) {
		this.name = name;
	}
// setXxx��getXxx����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
