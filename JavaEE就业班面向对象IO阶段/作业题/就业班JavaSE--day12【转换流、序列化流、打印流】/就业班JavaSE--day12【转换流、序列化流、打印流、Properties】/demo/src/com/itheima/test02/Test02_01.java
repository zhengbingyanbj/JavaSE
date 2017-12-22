package com.itheima.test02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test02_01 {
	/*
	 * �ڵ�ǰ��Ŀ��Ŀ¼��׼����һ��test.txt ���ı��ļ���Ҫ����ı��ļ���ʹ��GBK���룬���������£�
		��ǰ���¹�
		���ǵ���˪
		��ͷ������
		��ͷ˼����
		�����ֽ���+ת������������ı��ļ�����UTF8�ı��뷽ʽ����ȡ������д��test2.txt�ļ���
	 */
	public static void main(String[] args) throws IOException {
		// �����ֽ��������������Ҫ��ȡ���ļ�
		FileInputStream in = new FileInputStream("test.txt");
		// ����ת������������
		InputStreamReader isr = new InputStreamReader(in);
		// �����ֽ�������������Ҫ������ļ�
		FileOutputStream os = new FileOutputStream("test2.txt");
		// ����ת�����������
		OutputStreamWriter osw = new OutputStreamWriter(os,"utf8");
		
		// �����ַ������Ŷ�ȡ����
		char[] buffer = new char[1024];
		// ����������ն�ȡ���ַ���
		int len = -1;
		while((len = isr.read(buffer)) != -1){
			// �������������ȡ���ݱ��浽�ļ���
			osw.write(buffer, 0, len);
		}
		// �ر����ͷ���Դ
		isr.close();
		osw.close();
	}
}
