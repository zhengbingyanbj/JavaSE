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
			//ʹ�ÿͻ��˶����ȡ�ֽ�������
			InputStream in = thisSocket.getInputStream();
			
			String fileName= "itcast.cn"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
			//����FileOutputStream����
			FileOutputStream fos = new FileOutputStream("d:\\upload1\\"+fileName);
			//ѭ����д
			byte[] bytes = new byte[1024];
			int len = 0;
			while((len = in.read(bytes))!=-1){
				fos.write(bytes,0,len);
			}
			
			System.out.println("------------��ͻ��˷�������--------------------");
			//��ȡ�ֽ���������� 
			OutputStream out = thisSocket.getOutputStream();
			//��ͻ��˷����ϴ��ɹ�
			out.write("�ϴ��ɹ�".getBytes());
			
			
			out.close();
			fos.close();
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
