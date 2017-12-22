package com.itheima.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP服务端
 * 	 java.net.ServerSocket
 * 		构造方法
 * 			ServerSocket(int port) 服务端对象
 * 		方法 
 * 			Socket accept() 获取到连接的客户端对象
 * 1.创建服务端对象
 * 2.获取连接的客户端对象
 * 3.客户端获取字节输入流 
 * 4.接收客户端发送的数据  你好
 * 5.客户端获取字节输出流
 * 6.向客户端返回数据  不好
 * 7.关流
 * 
 */
public class TCPServer {

	public static void main(String[] args) throws IOException {
		//创建服务端对象
		ServerSocket ss = new ServerSocket(8888);
		//获取连接的客户端对象
		Socket thisSocket = ss.accept();
		//客户端获取字节输入流 
		InputStream in = thisSocket.getInputStream();
		
		//接收客户端发送的数据  你好
		byte[] bytes = new byte[1024];
		int len = in.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		System.out.println("--------向客户端返回数据----------------------");
		//客户端获取字节输出流
		OutputStream out = thisSocket.getOutputStream();
		//向客户端返回数据  不好
		out.write("不好".getBytes());
		
		out.close();
		in.close();
		thisSocket.close();
		ss.close();
		
	}
}














