package com.itheima.test01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_08 {

	/*
	 * ���ø�Ч�ֽ��������C���µ�d.txt�ļ����һ���ֽ�����
	 */
	public static void main(String[] args) throws IOException {
		// �����ֽ������FileOutputStream����ָ���ļ�·����
		FileOutputStream fos = new FileOutputStream("c:/d.txt");
		// �����ֽ������������Ч�ֽ����������
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// ���ø�Ч�ֽ�����������write(int byte)����д��һ���ֽ�����
		bos.write(97);
		// �ر���
		bos.close();
	}
}
