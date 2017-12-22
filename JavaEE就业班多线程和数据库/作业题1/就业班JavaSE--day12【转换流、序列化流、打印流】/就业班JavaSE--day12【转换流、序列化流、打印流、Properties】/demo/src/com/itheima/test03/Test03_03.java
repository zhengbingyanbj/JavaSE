package com.itheima.test03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
	C盘下有两个文本文件，分别为a.txt和b.txt，其中a.txt编码方式是gbk,而b.txt的编码方式是utf8。要求将使用转换流实现如下功能：
 	将a.txt和b.txt文件的内容复制到c.txt文件中，保证内容不乱码。
 */
public class Test03_03 {
	
	public static void main(String[] args) throws IOException {
		// 将a.txt文件的内容复制到c.txt文件中，使用gbk方法读取a.txt文件
		copyFile("c:/a.txt","c:/c.txt","gbk");
		// 将b.txt文件的内容复制到c.txt文件中，使用utf8方法读取b.txt文件
		 copyFile("c:/b.txt","c:/c.txt","utf8");
	}

	private static void copyFile(String src,String dest,String encoding) throws FileNotFoundException, IOException {
		// 创建转换输入流对象：使用默认的编码方式gbk读取a.txt文件
		InputStreamReader isr = new InputStreamReader(new FileInputStream(src),encoding);
		// 创建转换输出流对象:使用默认的编码方式：gbk
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(dest,true));
		char[] cbuf = new char[1024];
		int len = -1;
		while((len = isr.read(cbuf)) != -1) {
			osw.write(cbuf, 0, len);
		}
		osw.write("\n");
		// 关闭流释放资源
		isr.close();
		osw.close();
	}
}
