package com.itheima.level3_01;

public class Student {
	
	static {
		System.out.println("Student ��ľ�̬�����");
	}
	
	public Student(){
		System.out.println("Student ��Ĺ��췽��");
	}
	
	public Student(String methodName){
		System.out.println("��"+methodName+"����Student������õ�");
	}
}
