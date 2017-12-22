package com.itheima.test02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test02_01 {
	/*
	 * 在当前项目根目录下准备好一个test.txt 的文本文件，要求该文本文件是使用GBK编码，其内容如下：
		窗前明月光
		疑是地上霜
		举头望明月
		低头思故乡
		利用字节流+转换流读入这个文本文件，以UTF8的编码方式将读取的内容写到test2.txt文件中
	 */
	public static void main(String[] args) throws IOException {
		// 创建字节输入流对象关联要读取的文件
		FileInputStream in = new FileInputStream("test.txt");
		// 创建转换输入流对象
		InputStreamReader isr = new InputStreamReader(in);
		// 创建字节输出流对象关联要保存的文件
		FileOutputStream os = new FileOutputStream("test2.txt");
		// 创建转换输出流对象
		OutputStreamWriter osw = new OutputStreamWriter(os,"utf8");
		
		// 定义字符数组存放读取数据
		char[] buffer = new char[1024];
		// 定义变量接收读取的字符数
		int len = -1;
		while((len = isr.read(buffer)) != -1){
			// 利用输出流将读取内容保存到文件中
			osw.write(buffer, 0, len);
		}
		// 关闭流释放资源
		isr.close();
		osw.close();
	}
}
