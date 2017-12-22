package com.itheima.test02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02_04 {
	/*
	 * 在C盘下创建一个目录d1,在目录d1下创建若干个txt文件，并在每一个txt文件中添加若干内容。
	 * 将所有txt文件的内容复制到D盘下的copy.txt中 .要求所有txt的文件内容都复制到同一个文件中
	 */
	public static void main(String[] args) throws IOException {
		// 创建文件对象
		File dir = new File("c:/d1");
		// 获得该文件下的所有文件
		File[] files = dir.listFiles();
		// 创建目标文件
		File destFile = new File("d:/copy.txt");
		// 遍历文件数组
		for (File file : files) {
			// 创建高效字节输入流对象
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			// 创建高效字节输出流对象
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile,true));
			// 定义字节数组接收读取的字节数
			byte[] buffer = new byte[1024];
			// 定义变量接收实际读取的字节数
			int len = -1;
			// 从输入流中循环读取数据
			while((len = bis.read(buffer)) != -1) {
				// 利用输入流将数据写出到目标文件中
				bos.write(buffer, 0, len);
			}
			// 关闭资源
			bis.close();
			bos.close();
		}
	}
}
