package com.itheima.test01;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test01_08 {

	/*
	 * 从键盘录入一行字符串，利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中
	 */
	public static void main(String[] args) throws IOException {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一行字符串：");
		// 接收用户输入的数据
		String line = sc.nextLine();
		// 创建字节打印流对象
		PrintStream ps = new PrintStream("d.txt");
		// 将字符串写出到文件中
		ps.println(line);
		// 关流
		ps.close();
	}
}
