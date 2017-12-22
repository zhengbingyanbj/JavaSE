package com.itheima.tcp.upload.thread;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class UploadTask implements Runnable{
	
	
	private Socket thisSocket;
	
	public UploadTask(Socket thisSocket){
		this.thisSocket = thisSocket;
	}
	

	@Override
	public void run() {
		try {
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
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
