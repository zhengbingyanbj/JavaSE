package com.itheima.test03;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test03_02 {
	/*
	 �Ӽ�������һ���ļ���·�������ô�ӡ�������ļ����µ������ļ�(�������ļ���)���Ƶ�D����temp�ļ����¡�
	 */
	public static void main(String[] args) throws IOException {
		// ����ļ��ж���
		File dir = inputFile();
		// ����Ŀ���ļ��ж���
		File destDir = new File("d:/temp");
		copyDir(dir,destDir);
	}
	
	/*
	 * ���ô�ӡ�������ļ����µ������ļ�(�������ļ���)���Ƶ�D����temp�ļ����¡�
	 */
	public static void copyDir(File srcDir,File destDir) throws IOException{
		// �����ļ���
		destDir.mkdirs();
		// ���Դ�ļ��������е��ļ������ļ���
		File[] files = srcDir.listFiles();
		// �����ļ�����
		for (File file : files) {
			File destFile = new File(destDir,file.getName()); 
			// �ж�file�Ƿ����ļ���
			if(file.isDirectory()) {
				// �ݹ���õ�ǰ����
				copyDir(file, destFile);
			} else { // ������ļ�,������Ŀ���ļ���destDir��
				copyFile(file, destFile);
			}
		}
	}
	
	/*
	 * �ֽ�������������д�ֽ����� 
	 */
	private static void copyFile(File srcFile, File destFile) throws IOException {
	
		// �����ֽڻ���������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		// ������ӡ������
		PrintStream ps = new PrintStream(destFile);
		
		int len = 0;
		byte[] buffer = new byte[1024];
		// ѭ����ȡ����
		while((len = bis.read(buffer)) !=-1) {
			// ��������������Ŀ��д����
			ps.write(buffer,0,len);
		}
		// �ر���Դ
		bis.close();
		ps.close();
	}
	
	/*
	 * �����û������·���ַ��������ļ����� 
	 */
	private static File inputFile() {
		// ���������������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ���·����");
		// �����û������·��
		String filePath = sc.nextLine();
		// ����·���ַ��������ļ�����
		File dir = new File(filePath);
		if(!dir.exists()) throw new RuntimeException("��������ļ�·�������ڣ�����");
		// �ж��Ƿ����ļ���
		if(!dir.isDirectory()){
			throw new RuntimeException("�����·�������ļ���·��������");
		}
		return dir;
	}
}
