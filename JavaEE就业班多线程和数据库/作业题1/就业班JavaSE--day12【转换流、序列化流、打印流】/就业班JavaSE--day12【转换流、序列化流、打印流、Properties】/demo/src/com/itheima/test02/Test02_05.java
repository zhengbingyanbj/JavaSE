package com.itheima.test02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class Test02_05 {
	/*
	 * ��C���µ�a.pngͼƬ���Ƶ�D����
	 */
	public static void main(String[] args) throws Exception{
		// �����ֽڴ�ӡ���������Ŀ���ļ�
		PrintStream ps = new PrintStream("b.png");
		// ������Ч�ֽ����������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.png"));
		// �����ֽ�������ն�ȡ������
		byte[] buffer = new byte[1024];
		int len = -1;
		// ����������ѭ����ȡ����
		while((len = bis.read(buffer)) != -1) {
			// ���ô�ӡ��������д����Ŀ���ļ���
			ps.write(buffer,0,len);
		}
		// �ر���Դ
		ps.close();
		bis.close();
	}
	
}
