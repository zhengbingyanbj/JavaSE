package com.itheima.test01;

import java.io.IOException;
import java.io.PrintWriter;

public class Test01_09 {

	/*
	 * �����ַ���ӡ�����ַ������Ұ�Java�� ���浽��ǰ��Ŀ�ĸ�Ŀ¼�µ�e.txt�ļ��С�
	 */
	public static void main(String[] args) throws IOException {
		// �����ַ���ӡ�����󲢹����ļ�
		PrintWriter pw = new PrintWriter("e.txt");
		// Ҫ���������
		String content = "�Ұ�Java";
		// ���ô�ӡ���ķ��������ַ���
		pw.println(content);
		// ˢ�»�����
		pw.flush();
		// �ر���
		pw.close();
	}

}
