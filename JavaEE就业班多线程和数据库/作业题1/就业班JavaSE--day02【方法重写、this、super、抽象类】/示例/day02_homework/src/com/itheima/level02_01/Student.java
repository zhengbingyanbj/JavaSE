package com.itheima.level02_01;
/*
 3.����ѧ����(Student),�̳�Person��
	i.��Ա����: score(�ɼ�)
	ii.��Ա����:
		1. ��д����� eat()����
			a)���: �ɼ�Ϊ90�ֵ�15�����С��ѧ���ڳ�ѧ����
		2. ���з���: study() ѧϰ����
			a)���: �ɼ�Ϊ90�ֵ�15�����С��ѧ����ѧϰ
	iii.�ṩ�ղκʹ��ι��췽��
	iv.�ṩsetXxx��getXxx����
 */
public class Student extends Person {
//	score(�ɼ�)
	private int score;
	
//	��д����� eat()����
	public void eat() {
		System.out.println("�ɼ�Ϊ"+score+"�ֵ�"+getAge()+"���"+getName()+"ѧ���ڳ�ѧ����");
	}
//	study() ѧϰ����
	public void study(){
		System.out.println("�ɼ�Ϊ"+score+"�ֵ�"+getAge()+"���"+getName()+"ѧ����ѧϰ");
	}
	
//	�޲ι���
	public Student() {
		super();
	}
//	���ι���
	public Student(String name, int age,int score) {
		super(name, age);
		this.score = score;
	}
	
//	�ṩsetXxx��getXxx����
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
