package com.itheima.test01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_07 {

	/*
	 * ���ֽ�����C���µ�a.pngͼƬ���Ƶ�D����(�ļ�������һ��)
		Ҫ��һ�ζ�дһ���ֽ�����ķ�ʽ���и���
	 */
	public static void main(String[] args) throws IOException {
		// �����ֽ����������󲢹����ļ�
		FileInputStream fis = new FileInputStream("c:/a.png");
		// �����ֽ���������󲢹����ļ�
		FileOutputStream fos = new FileOutputStream("d:/a.png");
		// �������ݽ��ն�ȡ���ֽ���
		byte[] buffer = new byte[1024];
		// ����������ն�ȡ���ֽ���
		int len = -1;
		// ѭ����ȡͼƬ����
		while((len = fis.read(buffer)) != -1) {
			// ���ֽ������е�����д����Ŀ���ļ���
			fos.write(buffer,0,len);
		}
		// �ر���
		fis.close();
		fos.close();
	}

}
