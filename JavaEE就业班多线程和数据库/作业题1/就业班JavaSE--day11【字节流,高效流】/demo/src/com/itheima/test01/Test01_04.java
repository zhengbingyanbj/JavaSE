package com.itheima.test01;

import java.io.FileInputStream;
import java.io.IOException;

public class Test01_04 {

	/*
	 * �����ֽ���������ȡC���ļ�a.txt�����ݣ�ʹ��ѭ����ȡ��һ�ζ�ȡһ���ֽڣ�ֱ����ȡ���ļ�ĩβ������ȡ���ֽ����������̨
	 */
	public static void main(String[] args) throws IOException {
		// �����ֽ����������󲢹����ļ�
		FileInputStream fis = new FileInputStream("c:/a.txt");
		// ����������ն�ȡ���ֽ�
		int len = -1;
		// ѭ�������ж�ȡ����
		while((len = fis.read()) != -1) {
			System.out.print((char)len);
		}
		// �ر���
		fis.close();
	}

}
