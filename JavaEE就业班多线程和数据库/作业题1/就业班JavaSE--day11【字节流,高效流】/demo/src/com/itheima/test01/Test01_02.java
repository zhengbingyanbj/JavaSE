package com.itheima.test01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_02 {

	// 利用字节输出流一次写一个字节数组的方式向C盘的b.txt文件输出内容。
	public static void main(String[] args) throws IOException {
		// 1.创建字节输出流FileOutputStream对象并指定文件路径。
		FileOutputStream fos = new FileOutputStream("c:/b.txt");
		// 2.调用字节输出流的write(byte[] buf)方法写出数据。
		byte[] buf = "i love java".getBytes();
		fos.write(buf);
		// 3.关闭资源
		fos.close();
	}

}
