package com.itheima.test01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_02 {

	// �����ֽ������һ��дһ���ֽ�����ķ�ʽ��C�̵�b.txt�ļ�������ݡ�
	public static void main(String[] args) throws IOException {
		// 1.�����ֽ������FileOutputStream����ָ���ļ�·����
		FileOutputStream fos = new FileOutputStream("c:/b.txt");
		// 2.�����ֽ��������write(byte[] buf)����д�����ݡ�
		byte[] buf = "i love java".getBytes();
		fos.write(buf);
		// 3.�ر���Դ
		fos.close();
	}

}
