package com.itheima.test01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_09 {

	/*
	 * ���ø�Ч�ֽ��������C���µ�e.txt�ļ�д��һ���ֽ��������ݣ���д������i love java��
	 */
	public static void main(String[] args) throws IOException {
		// �����ֽ������FileOutputStream����ָ���ļ�·����
		FileOutputStream fos = new FileOutputStream("c:/e.txt");
		// �����ֽ������������Ч�ֽ����������
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// ���ø�Ч�ֽ�����������write(byte[] buff)����д��һ���ֽ�����
		bos.write("i love java".getBytes());
		// �ر���
		bos.close();
	}

}
