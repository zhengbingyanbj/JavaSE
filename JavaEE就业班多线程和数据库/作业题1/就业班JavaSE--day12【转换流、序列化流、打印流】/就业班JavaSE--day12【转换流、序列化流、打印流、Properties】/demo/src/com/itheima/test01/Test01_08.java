package com.itheima.test01;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test01_08 {

	/*
	 * �Ӽ���¼��һ���ַ����������ֽڴ�ӡ���������ַ������浽��ǰ��Ŀ��Ŀ¼�µ�d.txt�ļ���
	 */
	public static void main(String[] args) throws IOException {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		// �����û����������
		String line = sc.nextLine();
		// �����ֽڴ�ӡ������
		PrintStream ps = new PrintStream("d.txt");
		// ���ַ���д�����ļ���
		ps.println(line);
		// ����
		ps.close();
	}
}
