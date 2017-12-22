package com.itheima.test01;

import java.io.FileReader;
import java.io.IOException;

public class Test01_03 {

	/*
	 * 在C盘下创建一个c.txt文件，往该文件中输入多行文本数据，利用字符输入流读取该文件的内容并输入到控制台上。
		要求使用两种方式读取：
		* 一次读取一个字符
		* 一次读取一个字符数组。
	 */
	public static void main(String[] args) throws IOException {
		 // 一次读取一个字符
		 readChar();
		 // 一次读取一个字符数组。
		 readCharArray();
	}

	/*
	 * 一次读取一个字符数组。
	 */
	public static void readCharArray() throws IOException {
		// 创建字符串输入流对象
		FileReader fr = new FileReader("c.txt");
		// 定义变量接收实际读取的字符数
		int len = -1;
		// 定义字符数组存放读取的字符
		char[] buffer = new char[1024];
		// 循环读取内容
		while((len = fr.read(buffer)) != -1) {
			System.out.print(new String(buffer,0,len));
		}
		// 关闭流释放资源
		fr.close();
	}
	
	/*
	 * 一次读取一个字符
	 */
	public static void readChar() throws IOException {
		// 创建字符串输入流对象
		FileReader fr = new FileReader("c.txt");
		// 定义变量接收读取的字符数据
		int len = -1;
		// 循环读取内容
		while((len = fr.read()) != -1) {
			System.out.print((char)len);
		}
		// 关闭流释放资源
		fr.close();
	}
}
