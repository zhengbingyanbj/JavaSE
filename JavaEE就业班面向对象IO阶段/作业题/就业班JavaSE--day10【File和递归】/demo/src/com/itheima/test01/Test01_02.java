package com.itheima.test01;

import java.io.File;
import java.io.IOException;

public class Test01_02 {

	public static void main(String[] args) throws IOException {
		// �����ļ����󣺾���·��
		File f = new File("c:/a.txt");
		// ����ļ������ڣ��򴴽��ļ�
		if(!f.exists()) {
			f.createNewFile();
		}
	}

}
