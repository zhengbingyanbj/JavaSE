package com.itheima.test01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_07 {

	/*
	 * 用字节流将C盘下的a.png图片复制到D盘下(文件名保存一致)
		要求：一次读写一个字节数组的方式进行复制
	 */
	public static void main(String[] args) throws IOException {
		// 创建字节输入流对象并关联文件
		FileInputStream fis = new FileInputStream("c:/a.png");
		// 创建字节输出流对象并关联文件
		FileOutputStream fos = new FileOutputStream("d:/a.png");
		// 定义数据接收读取的字节数
		byte[] buffer = new byte[1024];
		// 定义变量接收读取的字节数
		int len = -1;
		// 循环读取图片数据
		while((len = fis.read(buffer)) != -1) {
			// 将字节数组中的数据写出到目标文件中
			fos.write(buffer,0,len);
		}
		// 关闭流
		fis.close();
		fos.close();
	}

}
