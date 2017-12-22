package com.itheima.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP�����
 * 	 java.net.ServerSocket
 * 		���췽��
 * 			ServerSocket(int port) ����˶���
 * 		���� 
 * 			Socket accept() ��ȡ�����ӵĿͻ��˶���
 * 1.��������˶���
 * 2.��ȡ���ӵĿͻ��˶���
 * 3.�ͻ��˻�ȡ�ֽ������� 
 * 4.���տͻ��˷��͵�����  ���
 * 5.�ͻ��˻�ȡ�ֽ������
 * 6.��ͻ��˷�������  ����
 * 7.����
 * 
 */
public class TCPServer {

	public static void main(String[] args) throws IOException {
		//��������˶���
		ServerSocket ss = new ServerSocket(8888);
		//��ȡ���ӵĿͻ��˶���
		Socket thisSocket = ss.accept();
		//�ͻ��˻�ȡ�ֽ������� 
		InputStream in = thisSocket.getInputStream();
		
		//���տͻ��˷��͵�����  ���
		byte[] bytes = new byte[1024];
		int len = in.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		System.out.println("--------��ͻ��˷�������----------------------");
		//�ͻ��˻�ȡ�ֽ������
		OutputStream out = thisSocket.getOutputStream();
		//��ͻ��˷�������  ����
		out.write("����".getBytes());
		
		out.close();
		in.close();
		thisSocket.close();
		ss.close();
		
	}
}














