package com.itheima.test03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
 * �ӿ���̨��ȡ������ļ�Ŀ¼Ȼ�󽫸�Ŀ¼(������Ŀ¼)�µ�.java�ļ����Ƶ�D:/java�ļ�����,��ͳ��java�ļ��ĸ���.
��ʾ:�������ͬ�����Ƶ��ļ�,�������Test01.java,�򿽱���Ŀ���ļ���ʱֻ����һ��Test01.java,
��һ��Test01.javaҪ�޸�Ϊ��һ������:�����ƿ��������,ֻҪ���ظ�����.
 */
public class Test03_03 {
	// ����ͳ�Ʊ�����¼Java�ļ�������
	static int count = 0;
	public static void main(String[] args) throws IOException{
		// ���Դ�ļ���
		File srcDir = inputFile();
		// ����Ŀ���ļ��ж���
		File destDir = new File("d:/java");
		destDir.mkdirs();
		// ����Java�ļ�
		copyJavaFile(srcDir, destDir);
		System.out.println("count = " + count);
	}
	
	/*
	 * ��srcDir�ļ����µ�����.Java�ļ�������destDir�ļ�����
	 */
	public static void copyJavaFile(File srcDir,File destDir) throws IOException{
		// ���Դ�ļ��������е�.java�ļ������ļ���
		File[] files = srcDir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if(pathname.isDirectory() || pathname.getName().endsWith(".java"))return true;
				return false;
			}
		});
		// �����ļ�����
		for (File file : files) {
			// �ж�file�Ƿ����ļ���
			if(file.isDirectory()) {
				// �ݹ���õ�ǰ����
				copyJavaFile(file, destDir);
			} else { // ������ļ�,������Ŀ���ļ���destDir��
				// ���Ҫ�������ļ���
				String fileName = file.getName(); 
				// ��Ŀ���ļ���destDir�´���һ��ͬ���ļ���
				File destFile = new File(destDir,fileName); 
				// �ж�Ŀ���ļ��Ƿ����
				while(destFile.exists()) {
					// ������Ŀ���ļ��� 
					destFile = new File(destDir,new Random().nextInt(100000) + fileName);
				}
				System.out.println(destFile);
				copyFile(file, destFile);
			}
		}
	}
	
	/*
	 * �ֽ�������������д�ֽ����� 
	 */
	private static void copyFile(File srcFile, File destFile) throws IOException {
		// ��������һ
		count ++;
		// �����ֽڻ���������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		// �����ֽڻ��������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
		
		int len = 0;
		byte[] buffer = new byte[1024];
		// ѭ����ȡ����
		while((len = bis.read(buffer)) !=-1) {
			// ��������������Ŀ��д����
			bos.write(buffer,0,len);
		}
		
		// �ر���Դ
		bis.close();
		bos.close();
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
