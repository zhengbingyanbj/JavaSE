package com.itheima.test02;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.itheima.test01.Student;

public class Test02_02 {
	/*
	 * ����һ��ѧ���࣬��Ա���������������䣬�Ա��ṩsetters��getters�����Լ����췽��
		����һ�������࣬�ڲ����ഴ�����ѧ�����󱣴浽�����У�Ȼ�󽫼��ϴ洢����ǰ��Ŀ��Ŀ¼�µ�stus.txt�ļ��С�
	 */
	public static void main(String[] args) throws IOException {
		// �������϶��󣬴��ѧ������
		List<Student> stus = new ArrayList<Student>();
		// ���ѧ������
		stus.add(new Student("jack",20,"��"));
		stus.add(new Student("rose",18,"Ů"));
		stus.add(new Student("laowang",20,"��"));
		// �����������������
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stus.txt"));
		// ��ѧ�����󱣴��ļ���
		oos.writeObject(stus);
		// �ر������ͷ���Դ
		oos.close();
	}
}