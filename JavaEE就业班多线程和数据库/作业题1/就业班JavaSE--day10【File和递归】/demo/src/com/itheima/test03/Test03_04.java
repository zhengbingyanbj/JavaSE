package com.itheima.test03;

import java.io.File;
import java.util.Scanner;

public class Test03_04 {
	public static void main(String[] args) {
		// ���������������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ���·����");
		// �����û������·��
		String filePath = sc.nextLine();
		// ����·���ַ��������ļ�����
		File dir = new File(filePath);
		// ��ӡĿ¼�ṹ
		printDir(dir,0);
	}

	/*
	 * ��ӡĿ¼�ṹ
	 * level:��ʾĿ¼�Ĳ��
	 */
	public static void printDir(File f,int level){
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
		System.out.println(f.getName());
		if(f.isDirectory()) {
			File[] files = f.listFiles();
			for (File file : files) {
				printDir(file,level + 1);
			}
		} 
	}
}
