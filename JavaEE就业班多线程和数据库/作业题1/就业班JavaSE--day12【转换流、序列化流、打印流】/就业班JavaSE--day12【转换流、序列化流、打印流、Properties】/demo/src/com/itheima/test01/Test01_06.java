package com.itheima.test01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test01_06 {

	/*
	 * ����һ��ѧ���࣬�������������䣬�Ա�ȳ�Ա�������ṩsetters��getters�����Լ����췽����
	 * �ڲ������д���һ��ѧ�����󣬸�ѧ�������������Ա������ֵ��Ȼ�󽫸ö��󱣴浽��ǰ��Ŀ��Ŀ¼�µ�stu.txt�ļ��С�
	 */
	public static void main(String[] args) throws IOException {
		// ����ѧ������
		Student s = new Student("jack",20,"��");
		// �����������������
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.txt"));
		// ��ѧ�����󱣴��ļ���
		oos.writeObject(s);
		// �ر������ͷ���Դ
		oos.close();
	}
}
