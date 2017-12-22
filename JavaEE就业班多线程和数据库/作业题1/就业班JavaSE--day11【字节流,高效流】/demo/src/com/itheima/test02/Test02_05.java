package com.itheima.test02;

import java.io.FileInputStream;
import java.io.IOException;

public class Test02_05 {
	/*
	 * ��C������һ���ı��ļ�test.txt(��������������ֺ���ĸ���)
		����һ������ͳ��test.txt�ļ���ָ���ַ����ֵĴ�����
		����a�ַ����ļ��г�����10������÷�������a�󣬷����ڲ������a����10��
	 */
	public static void main(String[] args) {
		// ���÷���
		calcuteCount('a');
	}
	/*
	 * ͳ���ַ����ļ��г��ֵĴ���
	 */
	public static void calcuteCount(char ch) {
		FileInputStream fis = null;
		try {
			// ����һ������������ͳ���ַ����ֵĴ���
			int count = 0;
			// �����ֽ�������
			fis = new FileInputStream("test.txt");
			// ѭ����ȡ����
			int len = -1;
			while ((len = fis.read()) != -1) {
				// ����ȡ���ֽ�ת�����ַ�
				char c = (char) len;
				// �ж��ַ�c����紫����ַ��Ƿ���ͬ
				if (c == ch) {
					count ++;
				}
			}
			System.out.println(ch+"������" + count +"��");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
