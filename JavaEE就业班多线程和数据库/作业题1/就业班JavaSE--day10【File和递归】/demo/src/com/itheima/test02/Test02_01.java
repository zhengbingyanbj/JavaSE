package com.itheima.test02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test02_01 {
	public static void main(String[] args) {
		try {
			// ��������¼�����
			Scanner sc = new Scanner(System.in);
			// ��ʾ�û�����һ���ļ�·��
			System.out.println("������һ���ļ�·��:");
			// �����û�������ļ�·��
			String filePath = sc.nextLine();
			// �����ļ�·�������ļ�����
			File file = new File(filePath);
			// �ж��ļ��Ƿ����
			if(!file.exists()) {
				// �����ڣ��򴴽��ļ�
				file.createNewFile();
			} else {
				// ����ļ���С
				System.out.println("�ļ���СΪ��" + file.length());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
