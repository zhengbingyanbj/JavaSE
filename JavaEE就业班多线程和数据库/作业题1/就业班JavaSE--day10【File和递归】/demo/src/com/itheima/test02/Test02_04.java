package com.itheima.test02;

import java.io.File;
import java.io.FileFilter;

public class Test02_04 {
	public static void main(String[] args) {
		// �����ļ��ж���
		File file = new File("c:/aaa");
		// ��ø��ļ����µ�����java�ļ�
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				// �ж��ļ���׺���Ƿ�.java�ļ�
				if(pathname.getName().endsWith(".java")) return true;
				return false;
			}
		});
		// �����ļ�����,��ӡ���е�Java�ļ�·��
		for (File f : files) {
			System.out.println(f.getAbsolutePath());
		}
	}
}
