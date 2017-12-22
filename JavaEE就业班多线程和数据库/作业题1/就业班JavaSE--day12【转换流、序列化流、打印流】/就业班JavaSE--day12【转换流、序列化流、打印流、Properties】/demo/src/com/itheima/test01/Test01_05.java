package com.itheima.test01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01_05 {

	/*
	 * 利用转换输入流将当前项目根目录下使用utf8编码的a.txt文件的内容读取出来，并打印在控制台上。
	      要求：不能出现乱码的情况。
	 */
	public static void main(String[] args) throws IOException {
		// 创建字节输入流对象并关联文件
		FileInputStream fis = new FileInputStream("a.txt");
		// 创建转换输入流对象
		InputStreamReader isr = new InputStreamReader(fis,"utf8");
		// 定义字符数组存放读取的内容
		char[] buffer = new char[1024];
		// 定义变量接收读取的字符个数
		int len = -1;
		while((len = isr.read(buffer)) != -1) {
			System.out.print(new String(buffer,0,len));
		}
		// 关闭流
		isr.close();
	}

}
