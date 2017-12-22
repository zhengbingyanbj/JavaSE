package com.itheima.test01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_12 {

	/*
	 * ���ָ����ļ���ʽ�Ƚ�
		1.�ֽ��������ļ�һ�ζ�дһ���ֽ�
		2.�ֽ��������ļ�һ�ζ�дһ���ֽ�����
		3.��Ч�������ļ�һ�ζ�дһ���ֽ�
		4.��Ч�������ļ�һ�ζ�ȡһ���ֽ�����
		�����������ַ�ʽ����ͬһ���ļ������ÿһ�ָ��Ʒ�ʽ���ѵ�ʱ�䡣
	 */
	public static void main(String[] args) throws IOException{
		System.out.println("�ֽ��������ļ�һ�ζ�дһ���ֽں�ʱ��"+ copy01());
		System.out.println("�ֽ��������ļ�һ�ζ�дһ���ֽ������ʱ��"+ copy02());
		System.out.println("��Ч�������ļ�һ�ζ�дһ���ֽں�ʱ��"+ copy03());
		System.out.println("��Ч�������ļ�һ�ζ�ȡһ���ֽ������ʱ��"+ copy04());
	}
	
	// �ֽ��������ļ�һ�ζ�дһ���ֽ�
	public static long copy01() throws IOException{
		// ��õ�ǰʱ�����ֵ
		long startTime = System.currentTimeMillis();
		// �����ֽ����������󲢹����ļ�
		FileInputStream fis = new FileInputStream("aaa.jpg");
		// �����ֽ���������󲢹����ļ�
		FileOutputStream fos = new FileOutputStream("ttt.jpg");
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
		return System.currentTimeMillis() - startTime;
	}
	
	// �ֽ��������ļ�һ�ζ�дһ���ֽ�����
	public static long copy02() throws IOException{
		// ��õ�ǰʱ�����ֵ
		long startTime = System.currentTimeMillis();
		// �����ֽ����������󲢹����ļ�
		FileInputStream fis = new FileInputStream("aaa.jpg");
		// �����ֽ���������󲢹����ļ�
		FileOutputStream fos = new FileOutputStream("eee.jpg");
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
		return System.currentTimeMillis() - startTime;
	}
	
	// ��Ч�������ļ�һ�ζ�дһ���ֽ�
	public static long copy03() throws IOException{
		// ��õ�ǰʱ�����ֵ
		long startTime = System.currentTimeMillis();
		// �����ֽ����������󲢹����ļ�·��
		FileInputStream fis = new FileInputStream("aaa.jpg");
		// �����ֽ���������󴴽���Ч�ֽ����������
		BufferedInputStream bis = new BufferedInputStream(fis);
		// �����ֽ����������ָ���ļ�·����
		FileOutputStream fos = new FileOutputStream("jjj.jpg");
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
		return System.currentTimeMillis() - startTime;
	}
	
	// ��Ч�������ļ�һ�ζ�ȡһ���ֽ�����
	public static long copy04() throws IOException{
		// ��õ�ǰʱ�����ֵ
		long startTime = System.currentTimeMillis();
		// �����ֽ����������󲢹����ļ�·��
		FileInputStream fis = new FileInputStream("aaa.jpg");
		// �����ֽ���������󴴽���Ч�ֽ����������
		BufferedInputStream bis = new BufferedInputStream(fis);
		// �����ֽ����������ָ���ļ�·����
		FileOutputStream fos = new FileOutputStream("ddd.jpg");
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
		return System.currentTimeMillis() - startTime;
	}
}
