package com.itheima.level3_01;

public class Test {

//	ʵ��(����)��Ա����
	Student s = new Student("��Ա������ʽ��ʼ����ʱ��");
	
//	��̬�����
	static {
		System.out.println("Test ��ľ�̬�����");
	}

	
	public static void main(String[] args) {
		System.out.println("main����");
//		����ѧ������
		Student s1 = new Student("main������");
//		����Test����
		Test t = new Test();
	}
}
