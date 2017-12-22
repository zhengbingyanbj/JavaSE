package com.itheima.test01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_10 {

	/*
	 * 利用高效字节输入流和高效字节输出流完成文件的复制。
		要求：
		1.将C盘下的b.png文件复制到D盘下
		一次读写一个字节方式复制
	 */
	public static void main(String[] args) throws IOException{
		// 创建字节输入流对象并关联文件路径
		FileInputStream fis = new FileInputStream("c:/b.png");
		// 利用字节输出流对象创建高效字节输出流对象
		BufferedInputStream bis = new BufferedInputStream(fis);
		// 创建字节输出流对象并指定文件路径。
		FileOutputStream fos = new FileOutputStream("d:/b.png");
		// 利用字节输出流创建高效字节输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 定义变量接收读取的字节数
		int len = -1;
		// 循环读取图片数据
		while((len = bis.read()) != -1) {
			// 每读取一个字节的数据就写出到目标文件中
			bos.write(len);
		}
		// 关闭流
		bis.close();
		bos.close();
	}
	
}
