package com.itheima.test01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_08 {

	/*
	 * 利用高效字节输出流往C盘下的d.txt文件输出一个字节数。
	 */
	public static void main(String[] args) throws IOException {
		// 创建字节输出流FileOutputStream对象并指定文件路径。
		FileOutputStream fos = new FileOutputStream("c:/d.txt");
		// 利用字节输出流创建高效字节输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 调用高效字节输出流对象的write(int byte)方法写出一个字节数据
		bos.write(97);
		// 关闭流
		bos.close();
	}
}
