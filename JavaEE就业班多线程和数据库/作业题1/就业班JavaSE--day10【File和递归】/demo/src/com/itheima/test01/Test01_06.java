package com.itheima.test01;

import java.io.File;
import java.io.IOException;

public class Test01_06 {

	public static void main(String[] args) throws IOException {
		// �����ļ�����
		File f = new File("c:/aaa/b.txt");
		// ����ļ���
		String filename = f.getName();
		// ����ļ���С
		long filesize = f.length();
		// ����ļ��ľ���·��
		String path = f.getAbsolutePath();
		// ��ø��ļ���·���������ַ���
		String parentPath = f.getParent();
		// ��ø��ļ���·���������ļ�����
		File parentFile = f.getParentFile();
		// �����Ϣ
		System.out.println("�ļ�����" + filename);
		System.out.println("�ļ���С��" + filesize);
		System.out.println("�ļ�·����" + path);
		System.out.println("�ļ���·����" + parentPath);
		System.out.println("�ļ���·����" + parentFile);
	}

}
