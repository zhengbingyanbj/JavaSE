package com.itheima.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP客户端 
 * 	  java.net.Socket
 * 		构造方法
 * 			Socket(InetAddress add,int port)
 * 			Socket(String ip,int port)
 * 			客户端对象 绑定服务端的地址及端口
 * 		方法
 * 			InputStream getInputStream() 获取字节输入流
 * 			OutputStream getOutputStream() 获取字节输出流
 * 
 * 1.创建客户端对象
 * 2.获取字节输出流对象
 * 3.向服务端发送 你好
 * 4.获取字节输入流对象
 * 5.接收服务端返回的数据  不好
 * 6.关流
 * 
 * 	
 */
public class TCPClient {

	public static void main(String[] args) throws IOException {
		//创建客户端对象
		Socket s = new Socket("127.0.0.1",8888);
		//获取字节输出流对象
		OutputStream out = s.getOutputStream();
		//向服务端发送 你好
		out.write("你好".getBytes());
		
		System.out.println("-------- 接收服务端返回的数据--------------------");
		//获取字节输入流对象
		InputStream in = s.getInputStream();
		//接收服务端返回的数据  不好
		byte[] bytes = new byte[1024];
		int len = in.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		in.close();
		out.close();
		s.close();
		
	}
}
