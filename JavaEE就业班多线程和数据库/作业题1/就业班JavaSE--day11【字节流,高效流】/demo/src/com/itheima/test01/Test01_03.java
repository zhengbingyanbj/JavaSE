package com.itheima.test01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_03 {

	/*
	 * 利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”
		要求：
		1.不能覆盖文件中原有的内容
		2.每一句输出各占一行
	 */
	public static void main(String[] args) throws IOException {
		// 1.创建字节输出流FileOutputStream对象并指定文件路径。以追加方式
		FileOutputStream fos = new FileOutputStream("c:/c.txt",true);
		// 2.调用字节输出流的write方法写出数据
		// 2.1 要输出的字符串
		String content = "i love java \r\n";
		for (int i = 0; i < 5; i++) {
			fos.write(content.getBytes());
		}
		// 3.关闭流
		fos.close();
	}

}
