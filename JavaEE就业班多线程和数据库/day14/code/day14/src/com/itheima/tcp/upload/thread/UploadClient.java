package com.itheima.tcp.upload.thread;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 文件上传客户端
 * 
 * 数据源:d:\\1.jpg
 * 数据目的:服务端
 * 
 * 1.创建客户端对象 绑定服务端地址和端口
 * 2.创建FileInputStream对象
 * 3.获取字节输出流对象
 * 4.循环读写
 * 5.获取字节输入流对象
 * 6.接收服务端返回的数据 上传成功
 * 7.关流
 */
public class UploadClient {

	public static void main(String[] args) throws  IOException {
		//创建客户端对象
		Socket s = new Socket("127.0.0.1", 9999);
		//创建FileInputStream对象 绑定数据源
		FileInputStream fis = new FileInputStream("d:\\1.jpg");
		//获取字节输出流对象
		OutputStream out = s.getOutputStream();
		//循环读写
		byte[] bytes = new byte[1024];
		int len = 0;
		while((len = fis.read(bytes))!=-1){
			out.write(bytes, 0, len);
		}
		
		//告知服务端已经写出完毕
		s.shutdownOutput();
		
		System.out.println("---------接收服务端返回的数据--------------");
		//获取字节输入流对象
		InputStream in = s.getInputStream();
		//接收服务端返回的数据 上传成功
		int length = in.read(bytes);
		System.out.println(new String(bytes,0,length));
		
		in.close();
		out.close();
		fis.close();
		s.close();
		
	}
}
