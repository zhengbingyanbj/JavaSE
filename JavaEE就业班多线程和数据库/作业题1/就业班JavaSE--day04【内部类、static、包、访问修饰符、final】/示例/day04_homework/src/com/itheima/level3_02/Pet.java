package com.itheima.level3_02;
/*
  1. ������������(Pet)
 		1. ���ԣ� ���ƣ�name
		2. ���󷽷�: eat()
 		3. �ṩ���ι����setXxx��getXxx����
 */
public abstract class Pet {
//	����
	private String name;
//	���󷽷�: eat()
	public abstract void eat();
//	�ṩ���ι����setXxx��getXxx����
	public Pet() {
	}
	public Pet(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
