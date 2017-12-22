package com.itheima.tcp.upload.thread;

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
		
		while(true){
			//获取连接的客户端对象
			Socket thisSocket = ss.accept();
			//创建线程任务对象 将客户端传进去
			UploadTask ut = new UploadTask(thisSocket);
			new Thread(ut).start();
		}
	
		
	}
}













