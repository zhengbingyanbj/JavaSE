package com.itheima.test01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test01_01 {

	// �Ӽ��̽����û������һ���ַ������������ַ���д�뵽C����a.txt�ļ���
	// Ҫ��һ��д��һ���ַ���
	public static void main(String[] args) throws IOException {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		// �����û����������
		String line = sc.nextLine();
		// �����ַ�����������󲢹���Ŀ���ļ�
		FileWriter fw = new FileWriter("c:/a.txt");
		// ʹ��ѭ��һ��д��һ���ַ�
		for (int index = 0; index < line.length(); index++) {
			fw.write(line.charAt(index));
		}
		// �ر����ͷ���Դ
		fw.close();
	}

}
