package com.itheima.test01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Test01_10 {

	/*
	 * ����һ�������û���Ŷ���ַ��������ô�ӡ���������е��ַ����������ǰ��Ŀ��Ŀ¼�µ�array.txt�ļ��У�Ҫ��һ���ַ���ռ��һ�С�
	 */
	public static void main(String[] args) throws IOException{
		// �������ϴ���ַ���
		ArrayList<String> strs = new ArrayList<String>();
		// ��Ӷ���ַ���
		strs.add("zhangsan");
		strs.add("lisi");
		strs.add("wangwu");
		
		// ������ӡ������
		PrintWriter pw = new PrintWriter(new FileOutputStream("array.txt"), true);
		// �������ϣ�������Ԫ��������ļ���
		for (String str : strs) {
			pw.println(str);
		}
		// �ر����ͷ���Դ
		pw.close();
	}
	
}
