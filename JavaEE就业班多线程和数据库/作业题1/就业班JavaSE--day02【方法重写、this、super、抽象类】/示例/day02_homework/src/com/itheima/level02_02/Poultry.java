package com.itheima.level02_02;

/*
 1.���������(Poultry)
	i.��Ա����(˽��):  ��ɫ(color),����(age)
	ii.��Ա����:  �Է�(void eat())
		1.�����ʽ:  2��ĺ�ɫ�����ڳԷ�
	iii.�ṩ�ղκʹ��ι��췽��
	iv.�ṩsetXxx��getXxx����
 */
public class Poultry {
//	i.��Ա����(˽��):  
//	��ɫ(color)
	private String color;
//	����(age)
	private int age;
//	ii.��Ա����:  �Է�(void eat())
//		1.�����ʽ:  2��ĺ�ɫ�����ڳԷ�
	public void eat(){
		System.out.println(age+"���"+color+"�ļ����ڳԷ�");
	}
//	iii.�ṩ�ղκʹ��ι��췽��
	public Poultry() {
		super();
	}
	public Poultry(String color, int age) {
		super();
		this.color = color;
		this.age = age;
	}	
//	iv.�ṩsetXxx��getXxx����
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
