package com.itheima.test01;

import java.io.File;
import java.io.IOException;

public class Test01_07 {

	public static void main(String[] args) throws IOException {
		// �����ļ�����
		File f1 = new File("c:/b.txt");
		// �ж��Ƿ���һ���ļ�
		if(f1.isFile()) {
			System.out.println(f1.getName()+"��һ���ļ�");
		}  else {
			System.out.println(f1.getName()+"����һ���ļ�");
		}
		
		// �����ļ�����
		File f2 = new File("c:/aaaa");
		// �ж��Ƿ���һ���ļ���
		if(f1.isDirectory()) {
			System.out.println(f1.getName()+"��һ���ļ���");
		}  else {
			System.out.println(f1.getName()+"����һ���ļ���");
		}
	}

}
