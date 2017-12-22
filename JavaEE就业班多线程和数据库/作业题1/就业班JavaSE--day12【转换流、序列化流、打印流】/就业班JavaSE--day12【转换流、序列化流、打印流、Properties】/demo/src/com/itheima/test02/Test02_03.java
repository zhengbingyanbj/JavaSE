package com.itheima.test02;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import com.itheima.test01.Student;

public class Test02_03 {
	/*
	 * ����һ�Ᵽ�浽stus.txt�ļ��м��϶����ȡ�������������Ͻ�ѧ����������ڿ���̨
	 */
	public static void main(String[] args) throws Exception {
		// �����ֽ����������󲢹����ļ�
		FileInputStream fis = new FileInputStream("stus.txt");
		// ������������������
		ObjectInputStream ois = new ObjectInputStream(fis);
		// ��ȡ���϶���
		List<Student> stus = (List<Student>) ois.readObject();
		// �ر���
		ois.close();
		
		// ��������
		for (Student stu : stus) {
			System.out.println(stu);
		}
	}
}
