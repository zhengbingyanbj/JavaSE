package com.itheima.test01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test01_04 {

	/*
	 * 现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。
		要求：使用utf8编码保存。
	 */
	public static void main(String[] args) throws IOException {
		// 要保存的字符串
		String content = "我爱Java";
		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("a.txt");
		// 创建转换输出流对象
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf8");
		// 调用方法写出数据
		osw.write(content);
		// 关闭流释放资源
		osw.close();
	}

}
