package com.itheima.test02;

import java.io.File;
import java.util.Scanner;

public class Test02_05 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		// ��ʾ�û�����һ���ļ�·��
		System.out.println("������һ���ļ���·��:");
		// �����û�������ļ���·��
		String dirPath = sc.nextLine();
		// �����ļ���·�������ļ�����
		File dir = new File(dirPath);
		// ��ø��ļ����µ������ļ�
		File[] files = dir.listFiles();
		// �����ļ�����ɾ��ÿһ���ļ�
		for (File file : files) {
			// ɾ���ļ�
			file.delete();
		}
		// ɾ���ļ���
		System.out.println(dir.delete()?"ɾ���ɹ�":"ɾ��ʧ��");
	}
}
