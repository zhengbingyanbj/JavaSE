package com.itheima.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test01_05 {

	/*
	 * �����ֽ���������ȡC���ļ�b.txt�����ݣ�ʹ��ѭ����ȡ��һ�ζ�ȡһ���ֽ����飬
	 * ֱ����ȡ���ļ�ĩβ������ȡ�����ֽ�����ת�����ַ������������̨��
	 */
	public static void main(String[] args) throws IOException {
		// �����ֽ����������󲢹����ļ�
		FileInputStream fis = new FileInputStream("c:/b.txt");
		// �����ֽ������Ŷ�ȡ���ֽ���
		byte[] buffer = new byte[1024];
		// ����������ն�ȡ���ֽ�
		int len = -1;
		// ѭ�������ж�ȡ����
		while((len = fis.read(buffer)) != -1) {
			System.out.print(new String(buffer,0,len));
		}
		// �ر���
		fis.close();
	}

}
