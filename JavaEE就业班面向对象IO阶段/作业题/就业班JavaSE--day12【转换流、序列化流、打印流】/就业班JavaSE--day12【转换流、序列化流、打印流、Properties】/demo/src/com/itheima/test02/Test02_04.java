package com.itheima.test02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test02_04 {
	/*
	 * 利用字符打印流将C盘下的ccc.txt文件复制到d盘下
	 */
	public static void main(String[] args) throws IOException {
		// 创建字符打印流对象关联目标文件
		PrintWriter pw = new PrintWriter("d:/ccc.txt");
		// 创建高效字符输出流对象
		BufferedReader br = new BufferedReader(new FileReader("c:/ccc.txt"));
		// 定义字符串接收读取的数据
		String line = null;
		// 从输入流中循环读取数据
		while((line = br.readLine()) != null) {
			// 利用打印流将数据写出到目标文件中
			pw.println(line);
		}
		// 关闭资源
		pw.close();
		br.close();
	}
}
