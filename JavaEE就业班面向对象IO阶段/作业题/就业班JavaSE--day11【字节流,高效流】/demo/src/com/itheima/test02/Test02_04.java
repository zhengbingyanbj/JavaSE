package com.itheima.test02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02_04 {
	/*
	 * ��C���´���һ��Ŀ¼d1,��Ŀ¼d1�´������ɸ�txt�ļ�������ÿһ��txt�ļ�������������ݡ�
	 * ������txt�ļ������ݸ��Ƶ�D���µ�copy.txt�� .Ҫ������txt���ļ����ݶ����Ƶ�ͬһ���ļ���
	 */
	public static void main(String[] args) throws IOException {
		// �����ļ�����
		File dir = new File("c:/d1");
		// ��ø��ļ��µ������ļ�
		File[] files = dir.listFiles();
		// ����Ŀ���ļ�
		File destFile = new File("d:/copy.txt");
		// �����ļ�����
		for (File file : files) {
			// ������Ч�ֽ�����������
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			// ������Ч�ֽ����������
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile,true));
			// �����ֽ�������ն�ȡ���ֽ���
			byte[] buffer = new byte[1024];
			// �����������ʵ�ʶ�ȡ���ֽ���
			int len = -1;
			// ����������ѭ����ȡ����
			while((len = bis.read(buffer)) != -1) {
				// ����������������д����Ŀ���ļ���
				bos.write(buffer, 0, len);
			}
			// �ر���Դ
			bis.close();
			bos.close();
		}
	}
}
