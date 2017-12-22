package com.itheima.test02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02_03 {
	/*
	 * ��C���´���һ��Ŀ¼d1,��Ŀ¼d1�´����������ɸ��ı��ļ�������ÿһ���ı��ļ�������������ݡ�
	 * �����ֽڸ�Ч������Ŀ¼�µ������ļ����Ƶ�C���µ�d2Ŀ¼�¡�
	 */
	public static void main(String[] args) throws IOException {
		// �����ļ�����
		File dir = new File("c:/d1");
		// ��ø��ļ��µ������ļ�
		File[] files = dir.listFiles();
		// ����Ŀ���ļ�
		File destDir = new File("c:/d2");
		// �����ļ�����
		for (File file : files) {
			// ������Ч�ֽ�����������
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			// ������Ч�ֽ����������
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(destDir,file.getName())));
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
