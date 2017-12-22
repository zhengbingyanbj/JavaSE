package com.itheima.tcp.upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
 * �ļ��ϴ������
 * 
 * ����Դ:�ͻ���
 * ����Ŀ��:d:\\upload1\\1.jpg
 * 
 * 1.��������˶��� �󶨶˿ں�
 * 2.����accept������ȡ���ӵĿͻ��˶���
 * 3.ʹ�ÿͻ��˶����ȡ�ֽ�������
 * 4.����FileOutputStream����
 * 5.ѭ����д
 * 6.��ȡ�ֽ���������� 
 * 7.��ͻ��˷����ϴ��ɹ�
 * 8.����
 */
public class UploadServer {

	public static void main(String[] args) throws IOException {
		//��������˶��� �󶨶˿ں�
		ServerSocket ss = new ServerSocket(9999);
		//����accept������ȡ���ӵĿͻ��˶���
		Socket thisSocket = ss.accept();
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
		thisSocket.close();
		ss.close();
		
	}
}













