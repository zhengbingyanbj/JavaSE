package com.itheima.test02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class Test02_05 {
	/*
	 * 将C盘下的a.png图片复制到D盘下
	 */
	public static void main(String[] args) throws Exception{
		// 创建字节打印流对象关联目标文件
		PrintStream ps = new PrintStream("b.png");
		// 创建高效字节输出流对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.png"));
		// 定义字节数组接收读取的数据
		byte[] buffer = new byte[1024];
		int len = -1;
		// 从输入流中循环读取数据
		while((len = bis.read(buffer)) != -1) {
			// 利用打印流将数据写出到目标文件中
			ps.write(buffer,0,len);
		}
		// 关闭资源
		ps.close();
		bis.close();
	}
	
}
