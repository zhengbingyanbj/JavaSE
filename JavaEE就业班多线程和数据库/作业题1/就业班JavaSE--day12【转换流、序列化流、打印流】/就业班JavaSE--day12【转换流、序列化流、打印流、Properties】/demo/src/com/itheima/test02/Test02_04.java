package com.itheima.test02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test02_04 {
	/*
	 * �����ַ���ӡ����C���µ�ccc.txt�ļ����Ƶ�d����
	 */
	public static void main(String[] args) throws IOException {
		// �����ַ���ӡ���������Ŀ���ļ�
		PrintWriter pw = new PrintWriter("d:/ccc.txt");
		// ������Ч�ַ����������
		BufferedReader br = new BufferedReader(new FileReader("c:/ccc.txt"));
		// �����ַ������ն�ȡ������
		String line = null;
		// ����������ѭ����ȡ����
		while((line = br.readLine()) != null) {
			// ���ô�ӡ��������д����Ŀ���ļ���
			pw.println(line);
		}
		// �ر���Դ
		pw.close();
		br.close();
	}
}
