package com.itheima.test01;

import java.io.FileInputStream;
import java.io.IOException;

public class Test01_04 {

	/*
	 * 利用字节输入流读取C盘文件a.txt的内容，使用循环读取，一次读取一个字节，直到读取到文件末尾。将读取的字节输出到控制台
	 */
	public static void main(String[] args) throws IOException {
		// 创建字节输入流对象并关联文件
		FileInputStream fis = new FileInputStream("c:/a.txt");
		// 定义变量接收读取的字节
		int len = -1;
		// 循环从流中读取数据
		while((len = fis.read()) != -1) {
			System.out.print((char)len);
		}
		// 关闭流
		fis.close();
	}

}
