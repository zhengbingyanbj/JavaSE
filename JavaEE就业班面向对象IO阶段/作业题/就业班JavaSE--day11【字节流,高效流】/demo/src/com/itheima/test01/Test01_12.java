package com.itheima.test01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_12 {

	/*
	 * 四种复制文件方式比较
		1.字节流复制文件一次读写一个字节
		2.字节流复制文件一次读写一个字节数组
		3.高效流复制文件一次读写一个字节
		4.高效流复制文件一次读取一个字节数组
		利用上面四种方式复制同一个文件，输出每一种复制方式花费的时间。
	 */
	public static void main(String[] args) throws IOException{
		System.out.println("字节流复制文件一次读写一个字节耗时："+ copy01());
		System.out.println("字节流复制文件一次读写一个字节数组耗时："+ copy02());
		System.out.println("高效流复制文件一次读写一个字节耗时："+ copy03());
		System.out.println("高效流复制文件一次读取一个字节数组耗时："+ copy04());
	}
	
	// 字节流复制文件一次读写一个字节
	public static long copy01() throws IOException{
		// 获得当前时间毫秒值
		long startTime = System.currentTimeMillis();
		// 创建字节输入流对象并关联文件
		FileInputStream fis = new FileInputStream("aaa.jpg");
		// 创建字节输出流对象并关联文件
		FileOutputStream fos = new FileOutputStream("ttt.jpg");
		// 定义变量接收读取的字节数
		int len = -1;
		// 循环读取图片数据
		while((len = fis.read()) != -1) {
			// 每读取一个字节的数据就写出到目标文件中
			fos.write(len);
		}
		// 关闭流
		fis.close();
		fos.close();
		return System.currentTimeMillis() - startTime;
	}
	
	// 字节流复制文件一次读写一个字节数组
	public static long copy02() throws IOException{
		// 获得当前时间毫秒值
		long startTime = System.currentTimeMillis();
		// 创建字节输入流对象并关联文件
		FileInputStream fis = new FileInputStream("aaa.jpg");
		// 创建字节输出流对象并关联文件
		FileOutputStream fos = new FileOutputStream("eee.jpg");
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
		return System.currentTimeMillis() - startTime;
	}
	
	// 高效流复制文件一次读写一个字节
	public static long copy03() throws IOException{
		// 获得当前时间毫秒值
		long startTime = System.currentTimeMillis();
		// 创建字节输入流对象并关联文件路径
		FileInputStream fis = new FileInputStream("aaa.jpg");
		// 利用字节输出流对象创建高效字节输出流对象
		BufferedInputStream bis = new BufferedInputStream(fis);
		// 创建字节输出流对象并指定文件路径。
		FileOutputStream fos = new FileOutputStream("jjj.jpg");
		// 利用字节输出流创建高效字节输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 定义变量接收读取的字节数
		int len = -1;
		// 循环读取图片数据
		while((len = bis.read()) != -1) {
			// 每读取一个字节的数据就写出到目标文件中
			bos.write(len);
		}
		// 关闭流
		bis.close();
		bos.close();
		return System.currentTimeMillis() - startTime;
	}
	
	// 高效流复制文件一次读取一个字节数组
	public static long copy04() throws IOException{
		// 获得当前时间毫秒值
		long startTime = System.currentTimeMillis();
		// 创建字节输入流对象并关联文件路径
		FileInputStream fis = new FileInputStream("aaa.jpg");
		// 利用字节输出流对象创建高效字节输出流对象
		BufferedInputStream bis = new BufferedInputStream(fis);
		// 创建字节输出流对象并指定文件路径。
		FileOutputStream fos = new FileOutputStream("ddd.jpg");
		// 利用字节输出流创建高效字节输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 定义字节数组接收读取的字节
		byte[] buffer = new byte[1024];
		// 定义变量接收读取的字节数
		int len = -1;
		// 循环读取图片数据
		while((len = bis.read(buffer)) != -1) {
			// 每读取一个字节的数据就写出到目标文件中
			bos.write(buffer,0,len);
		}
		// 关闭流
		bis.close();
		bos.close();
		return System.currentTimeMillis() - startTime;
	}
}
