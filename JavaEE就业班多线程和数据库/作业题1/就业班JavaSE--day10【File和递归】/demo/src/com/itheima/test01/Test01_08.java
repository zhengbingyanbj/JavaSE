package com.itheima.test01;

import java.io.File;
import java.io.IOException;

public class Test01_08 {

	public static void main(String[] args) throws IOException {
		// �����ļ�����
		File f = new File("c:/aaa");
		// ����ļ����������ļ�
		File[] files = f.listFiles();
		// �����ļ�����
		for (File file : files) {
			// ���ļ������ִ�ӡ������̨
			System.out.println(file.getName());
		}
	}

}
