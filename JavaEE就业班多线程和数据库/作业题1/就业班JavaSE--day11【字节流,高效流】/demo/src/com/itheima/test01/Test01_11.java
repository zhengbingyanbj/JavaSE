package com.itheima.test01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_11 {

	/*
	 * ���ø�Ч�ֽ��������͸�Ч�ֽ����������ļ��ĸ��ơ�
		Ҫ��
		1.��C���µ�c.png�ļ����Ƶ�D����
		2.һ�ζ�дһ���ֽ����鷽ʽ����
	 */
	public static void main(String[] args) throws IOException{
		// �����ֽ����������󲢹����ļ�·��
		FileInputStream fis = new FileInputStream("c:/c.png");
		// �����ֽ���������󴴽���Ч�ֽ����������
		BufferedInputStream bis = new BufferedInputStream(fis);
		// �����ֽ����������ָ���ļ�·����
		FileOutputStream fos = new FileOutputStream("d:/c.png");
		// �����ֽ������������Ч�ֽ����������
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// �����ֽ�������ն�ȡ���ֽ�
		byte[] buffer = new byte[1024];
		// ����������ն�ȡ���ֽ���
		int len = -1;
		// ѭ����ȡͼƬ����
		while((len = bis.read(buffer)) != -1) {
			// ÿ��ȡһ���ֽڵ����ݾ�д����Ŀ���ļ���
			bos.write(buffer,0,len);
		}
		// �ر���
		bis.close();
		bos.close();
	}
	
}
