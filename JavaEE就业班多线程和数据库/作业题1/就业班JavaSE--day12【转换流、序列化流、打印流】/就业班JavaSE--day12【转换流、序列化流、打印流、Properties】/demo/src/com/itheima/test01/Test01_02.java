package com.itheima.test01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test01_02 {

	/*
	 * 键盘接收用户输入的一行字符串，将这行字符串写入到C盘下b.txt文件中
	  要求：一次写出一个字符数组。
	 */
	public static void main(String[] args) throws IOException {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一行字符串：");
		// 接收用户输入的内容
		String line = sc.nextLine();
		// 创建字符流输出流对象并关联目标文件
		FileWriter fw = new FileWriter("c:/b.txt");
		// 将字符串写入到文件中
		fw.write(line.toCharArray());
		// 关闭流释放资源
		fw.close();
	}

}
