package com.itheima.test01;

import java.io.FileReader;
import java.io.IOException;

public class Test01_03 {

	/*
	 * ��C���´���һ��c.txt�ļ��������ļ�����������ı����ݣ������ַ���������ȡ���ļ������ݲ����뵽����̨�ϡ�
		Ҫ��ʹ�����ַ�ʽ��ȡ��
		* һ�ζ�ȡһ���ַ�
		* һ�ζ�ȡһ���ַ����顣
	 */
	public static void main(String[] args) throws IOException {
		 // һ�ζ�ȡһ���ַ�
		 readChar();
		 // һ�ζ�ȡһ���ַ����顣
		 readCharArray();
	}

	/*
	 * һ�ζ�ȡһ���ַ����顣
	 */
	public static void readCharArray() throws IOException {
		// �����ַ�������������
		FileReader fr = new FileReader("c.txt");
		// �����������ʵ�ʶ�ȡ���ַ���
		int len = -1;
		// �����ַ������Ŷ�ȡ���ַ�
		char[] buffer = new char[1024];
		// ѭ����ȡ����
		while((len = fr.read(buffer)) != -1) {
			System.out.print(new String(buffer,0,len));
		}
		// �ر����ͷ���Դ
		fr.close();
	}
	
	/*
	 * һ�ζ�ȡһ���ַ�
	 */
	public static void readChar() throws IOException {
		// �����ַ�������������
		FileReader fr = new FileReader("c.txt");
		// ����������ն�ȡ���ַ�����
		int len = -1;
		// ѭ����ȡ����
		while((len = fr.read()) != -1) {
			System.out.print((char)len);
		}
		// �ر����ͷ���Դ
		fr.close();
	}
}
