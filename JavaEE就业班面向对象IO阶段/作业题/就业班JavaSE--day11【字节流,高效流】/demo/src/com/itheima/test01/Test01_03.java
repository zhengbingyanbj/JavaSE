package com.itheima.test01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_03 {

	/*
	 * �����ֽ������������C����c.txt�ļ����5�䣺��i love java��
		Ҫ��
		1.���ܸ����ļ���ԭ�е�����
		2.ÿһ�������ռһ��
	 */
	public static void main(String[] args) throws IOException {
		// 1.�����ֽ������FileOutputStream����ָ���ļ�·������׷�ӷ�ʽ
		FileOutputStream fos = new FileOutputStream("c:/c.txt",true);
		// 2.�����ֽ��������write����д������
		// 2.1 Ҫ������ַ���
		String content = "i love java \r\n";
		for (int i = 0; i < 5; i++) {
			fos.write(content.getBytes());
		}
		// 3.�ر���
		fos.close();
	}

}
