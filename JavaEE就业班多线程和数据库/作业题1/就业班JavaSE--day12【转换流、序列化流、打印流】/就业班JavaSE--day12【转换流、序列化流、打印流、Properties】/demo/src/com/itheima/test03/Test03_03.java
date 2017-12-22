package com.itheima.test03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
	C�����������ı��ļ����ֱ�Ϊa.txt��b.txt������a.txt���뷽ʽ��gbk,��b.txt�ı��뷽ʽ��utf8��Ҫ��ʹ��ת����ʵ�����¹��ܣ�
 	��a.txt��b.txt�ļ������ݸ��Ƶ�c.txt�ļ��У���֤���ݲ����롣
 */
public class Test03_03 {
	
	public static void main(String[] args) throws IOException {
		// ��a.txt�ļ������ݸ��Ƶ�c.txt�ļ��У�ʹ��gbk������ȡa.txt�ļ�
		copyFile("c:/a.txt","c:/c.txt","gbk");
		// ��b.txt�ļ������ݸ��Ƶ�c.txt�ļ��У�ʹ��utf8������ȡb.txt�ļ�
		 copyFile("c:/b.txt","c:/c.txt","utf8");
	}

	private static void copyFile(String src,String dest,String encoding) throws FileNotFoundException, IOException {
		// ����ת������������ʹ��Ĭ�ϵı��뷽ʽgbk��ȡa.txt�ļ�
		InputStreamReader isr = new InputStreamReader(new FileInputStream(src),encoding);
		// ����ת�����������:ʹ��Ĭ�ϵı��뷽ʽ��gbk
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(dest,true));
		char[] cbuf = new char[1024];
		int len = -1;
		while((len = isr.read(cbuf)) != -1) {
			osw.write(cbuf, 0, len);
		}
		osw.write("\n");
		// �ر����ͷ���Դ
		isr.close();
		osw.close();
	}
}
