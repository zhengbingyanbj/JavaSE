package com.itheima.test01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_01 {

	// �����ֽ������һ��дһ���ֽڵķ�ʽ��C�̵�a.txt�ļ�������ݡ�
	public static void main(String[] args) throws IOException {
		// 1.�����ֽ������FileOutputStream����ָ���ļ�·����
		FileOutputStream fos = new FileOutputStream("c:/a.txt");
		// 2.�����ֽ��������write(int byte)����д������
		fos.write(97);
		// 3.�ر���
		fos.close();
	}

}
