package com.itheima.test01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_06 {

	/*
	 * �����ֽ�����C���µ�a.pngͼƬ���Ƶ�D����(�ļ�������һ��)
		Ҫ��
		1.һ�ζ�дһ���ֽڵķ�ʽ
	 */
	public static void main(String[] args) throws IOException {
		// �����ֽ����������󲢹����ļ�
		FileInputStream fis = new FileInputStream("c:/a.png");
		// �����ֽ���������󲢹����ļ�
		FileOutputStream fos = new FileOutputStream("d:/a.png");
		// ����������ն�ȡ���ֽ���
		int len = -1;
		// ѭ����ȡͼƬ����
		while((len = fis.read()) != -1) {
			// ÿ��ȡһ���ֽڵ����ݾ�д����Ŀ���ļ���
			fos.write(len);
		}
		// �ر���
		fis.close();
		fos.close();
	}

}
