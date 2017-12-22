package com.itheima.test02;

import java.io.FileInputStream;
import java.io.IOException;

public class Test02_05 {
	/*
	 * 在C盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
		定义一个方法统计test.txt文件中指定字符出现的次数。
		比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次
	 */
	public static void main(String[] args) {
		// 调用方法
		calcuteCount('a');
	}
	/*
	 * 统计字符在文件中出现的次数
	 */
	public static void calcuteCount(char ch) {
		FileInputStream fis = null;
		try {
			// 定义一个计数变量，统计字符出现的次数
			int count = 0;
			// 创建字节输入流
			fis = new FileInputStream("test.txt");
			// 循环读取数据
			int len = -1;
			while ((len = fis.read()) != -1) {
				// 将读取的字节转换成字符
				char c = (char) len;
				// 判断字符c和外界传入的字符是否相同
				if (c == ch) {
					count ++;
				}
			}
			System.out.println(ch+"出现了" + count +"次");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
