package com.itheima.test01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test01_02 {

	/*
	 * ���̽����û������һ���ַ������������ַ���д�뵽C����b.txt�ļ���
	  Ҫ��һ��д��һ���ַ����顣
	 */
	public static void main(String[] args) throws IOException {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		// �����û����������
		String line = sc.nextLine();
		// �����ַ�����������󲢹���Ŀ���ļ�
		FileWriter fw = new FileWriter("c:/b.txt");
		// ���ַ���д�뵽�ļ���
		fw.write(line.toCharArray());
		// �ر����ͷ���Դ
		fw.close();
	}

}
