package com.itheima.test01;

import java.io.File;
import java.io.IOException;

public class Test01_05 {

	public static void main(String[] args) throws IOException {
		// �����ļ�����
		File f = new File("c:/a.txt");
		// ɾ���ļ�
		f.delete();
		
		// �����ļ��ж���
		File dir = new File("c:/aaa");
		// ɾ���ļ���
		dir.delete();
	}

}
