package com.itheima.test02;

import java.io.File;

public class Test02_03 {
	public static void main(String[] args) {
		// �����ļ��ж���
		File dir = new File("c:/aaa");
		// ���õݹ鷽��
		printFiles(dir);
	}
	
	/*
	 * �ݹ鷽��������ָ���ļ��е������ļ�
	 */
	public static void printFiles(File dir){
		// ��ø��ļ����µ������ļ�
		File[] files = dir.listFiles();
		// �����ļ�����
		for (File f : files) {
			if(f.isFile()) { // ���ļ�
				System.out.println(f.getAbsolutePath());
			} else { // ���ļ��У��ݹ���õ�ǰ����
				printFiles(f);
			}
		}
	}
}
