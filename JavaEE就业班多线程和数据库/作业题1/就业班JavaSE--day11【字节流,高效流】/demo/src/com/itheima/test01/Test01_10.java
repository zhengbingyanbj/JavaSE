package com.itheima.test01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_10 {

	/*
	 * ���ø�Ч�ֽ��������͸�Ч�ֽ����������ļ��ĸ��ơ�
		Ҫ��
		1.��C���µ�b.png�ļ����Ƶ�D����
		һ�ζ�дһ���ֽڷ�ʽ����
	 */
	public static void main(String[] args) throws IOException{
		// �����ֽ����������󲢹����ļ�·��
		FileInputStream fis = new FileInputStream("c:/b.png");
		// �����ֽ���������󴴽���Ч�ֽ����������
		BufferedInputStream bis = new BufferedInputStream(fis);
		// �����ֽ����������ָ���ļ�·����
		FileOutputStream fos = new FileOutputStream("d:/b.png");
		// �����ֽ������������Ч�ֽ����������
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// ����������ն�ȡ���ֽ���
		int len = -1;
		// ѭ����ȡͼƬ����
		while((len = bis.read()) != -1) {
			// ÿ��ȡһ���ֽڵ����ݾ�д����Ŀ���ļ���
			bos.write(len);
		}
		// �ر���
		bis.close();
		bos.close();
	}
	
}
