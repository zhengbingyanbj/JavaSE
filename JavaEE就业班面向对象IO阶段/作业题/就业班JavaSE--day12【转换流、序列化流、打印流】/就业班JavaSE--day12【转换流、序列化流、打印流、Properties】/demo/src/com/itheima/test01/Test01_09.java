package com.itheima.test01;

import java.io.IOException;
import java.io.PrintWriter;

public class Test01_09 {

	/*
	 * 利用字符打印流将字符串”我爱Java” 保存到当前项目的根目录下的e.txt文件中。
	 */
	public static void main(String[] args) throws IOException {
		// 创建字符打印流对象并关联文件
		PrintWriter pw = new PrintWriter("e.txt");
		// 要保存的内容
		String content = "我爱Java";
		// 调用打印流的方法保存字符串
		pw.println(content);
		// 刷新缓冲区
		pw.flush();
		// 关闭流
		pw.close();
	}

}
