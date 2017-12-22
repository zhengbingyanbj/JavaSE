package com.itheima.tcp.upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
 * 文件上传服务端
 * 
 * 数据源:客户端
 * 数据目的:d:\\upload1\\1.jpg
 * 
 * 1.创建服务端对象 绑定端口号
 * 2.调用accept方法获取连接的客户端对象
 * 3.使用客户端对象获取字节输入流
 * 4.创建FileOutputStream对象
 * 5.循环读写
 * 6.获取字节输出流对象 
 * 7.向客户端返回上传成功
 * 8.关流
 */
public class UploadServer {

	public static void main(String[] args) throws IOException {
		//创建服务端对象 绑定端口号
		ServerSocket ss = new ServerSocket(9999);
		//调用accept方法获取连接的客户端对象
		Socket thisSocket = ss.accept();
		//使用客户端对象获取字节输入流
		InputStream in = thisSocket.getInputStream();
		
		
		String fileName= "itcast.cn"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
		//创建FileOutputStream对象
		FileOutputStream fos = new FileOutputStream("d:\\upload1\\"+fileName);
		//循环读写
		byte[] bytes = new byte[1024];
		int len = 0;
		while((len = in.read(bytes))!=-1){
			fos.write(bytes,0,len);
		}
		
		System.out.println("------------向客户端返回数据--------------------");
		//获取字节输出流对象 
		OutputStream out = thisSocket.getOutputStream();
		//向客户端返回上传成功
		out.write("上传成功".getBytes());
		
		
		out.close();
		fos.close();
		in.close();
		thisSocket.close();
		ss.close();
		
	}
}













