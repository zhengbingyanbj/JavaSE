package com.itheima.test01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_01 {

	// 利用字节输出流一次写一个字节的方式向C盘的a.txt文件输出内容。
	public static void main(String[] args) throws IOException {
		// 1.创建字节输出流FileOutputStream对象并指定文件路径。
		FileOutputStream fos = new FileOutputStream("c:/a.txt");
		// 2.调用字节输出流的write(int byte)方法写出数据
		fos.write(97);
		// 3.关闭流
		fos.close();
	}

}
