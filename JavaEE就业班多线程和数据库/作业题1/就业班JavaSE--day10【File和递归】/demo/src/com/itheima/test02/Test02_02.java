package com.itheima.test02;

import java.io.File;
import java.util.Scanner;

public class Test02_02 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		// ��ʾ�û�����һ���ļ�·��
		System.out.println("������һ���ļ�·��:");
		// �����û�������ļ�·��
		String filePath = sc.nextLine();
		// �����ļ�·�������ļ�����
		File file = new File(filePath);
		// �ж��Ƿ����ļ�
		if(file.isFile()) {
			// ����ļ���С
			System.out.println("�ļ���СΪ��" + file.length());
		} else {
			// ���ļ���
			// �������ͳ���ļ���С֮��
			int length = 0;
			// ��ø��ļ����µ������ļ�
			File[] files = file.listFiles();
			// �����ļ�����
			for (File f : files) {
				if(f.isFile()) {
					// �ۼ��ļ���С
					length += f.length();
				}
			}
			// ����ļ����ļ����ܴ�С
			System.out.println("�ļ��ܴ�СΪ��" + length);
		}
	}
}
