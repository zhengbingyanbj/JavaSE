package com.itheima.test01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test01_04 {

	/*
	 * ����һ�ַ��������Ұ�Java���������ַ������浽��ǰ��Ŀ��Ŀ¼�µ�a.txt�ļ��С�
		Ҫ��ʹ��utf8���뱣�档
	 */
	public static void main(String[] args) throws IOException {
		// Ҫ������ַ���
		String content = "�Ұ�Java";
		// �����ֽ����������
		FileOutputStream fos = new FileOutputStream("a.txt");
		// ����ת�����������
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf8");
		// ���÷���д������
		osw.write(content);
		// �ر����ͷ���Դ
		osw.close();
	}

}
