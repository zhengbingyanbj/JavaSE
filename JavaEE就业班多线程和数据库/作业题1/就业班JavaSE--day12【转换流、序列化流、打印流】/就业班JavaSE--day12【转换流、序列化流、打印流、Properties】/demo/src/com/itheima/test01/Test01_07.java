package com.itheima.test01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test01_07 {

	/*
	 * ����һ�Ᵽ�浽stu.txt�ļ��е�ѧ�������ȡ������
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// �����ֽ����������󲢹����ļ�
		FileInputStream fis = new FileInputStream("stu.txt");
		// ������������������
		ObjectInputStream ois = new ObjectInputStream(fis);
		// ��ȡѧ������
		Student s = (Student) ois.readObject();
		System.out.println(s);
		// �ر���
		ois.close();
	}

}
