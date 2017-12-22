package com.itheima.test02;

import java.io.File;
import java.util.Scanner;

public class Test02_06 {
	public static void main(String[] args) {
		// ���������������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ���·����");
		// �����û������·��
		String filePath = sc.nextLine();
		// ����·���ַ��������ļ�����
		File dir = new File(filePath);
		// ����calculate��������ļ���С
		long length = calculate(dir);
		System.out.println("�ļ����ܴ�С��" + length); 
	}
	
	/*
	 * ����ļ��еĴ�С
	 */
	public static long calculate(File dir){
		long length = 0;
		// ����ļ�����
		File files[] = dir.listFiles();
		// ��������
		for (File file : files) {
			// �ж��Ƿ����ļ�
			if(file.isFile()) {
				length += calculate(file);
			} else {
				length += file.length();
			}
		}
		return length;
	}
}
