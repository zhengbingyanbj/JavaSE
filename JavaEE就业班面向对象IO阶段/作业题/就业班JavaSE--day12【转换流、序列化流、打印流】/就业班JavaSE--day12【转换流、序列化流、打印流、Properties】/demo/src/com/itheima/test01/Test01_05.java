package com.itheima.test01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01_05 {

	/*
	 * ����ת������������ǰ��Ŀ��Ŀ¼��ʹ��utf8�����a.txt�ļ������ݶ�ȡ����������ӡ�ڿ���̨�ϡ�
	      Ҫ�󣺲��ܳ�������������
	 */
	public static void main(String[] args) throws IOException {
		// �����ֽ����������󲢹����ļ�
		FileInputStream fis = new FileInputStream("a.txt");
		// ����ת������������
		InputStreamReader isr = new InputStreamReader(fis,"utf8");
		// �����ַ������Ŷ�ȡ������
		char[] buffer = new char[1024];
		// ����������ն�ȡ���ַ�����
		int len = -1;
		while((len = isr.read(buffer)) != -1) {
			System.out.print(new String(buffer,0,len));
		}
		// �ر���
		isr.close();
	}

}
