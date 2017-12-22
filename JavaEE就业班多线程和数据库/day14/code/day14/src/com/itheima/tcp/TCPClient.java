package com.itheima.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP�ͻ��� 
 * 	  java.net.Socket
 * 		���췽��
 * 			Socket(InetAddress add,int port)
 * 			Socket(String ip,int port)
 * 			�ͻ��˶��� �󶨷���˵ĵ�ַ���˿�
 * 		����
 * 			InputStream getInputStream() ��ȡ�ֽ�������
 * 			OutputStream getOutputStream() ��ȡ�ֽ������
 * 
 * 1.�����ͻ��˶���
 * 2.��ȡ�ֽ����������
 * 3.�����˷��� ���
 * 4.��ȡ�ֽ�����������
 * 5.���շ���˷��ص�����  ����
 * 6.����
 * 
 * 	
 */
public class TCPClient {

	public static void main(String[] args) throws IOException {
		//�����ͻ��˶���
		Socket s = new Socket("127.0.0.1",8888);
		//��ȡ�ֽ����������
		OutputStream out = s.getOutputStream();
		//�����˷��� ���
		out.write("���".getBytes());
		
		System.out.println("-------- ���շ���˷��ص�����--------------------");
		//��ȡ�ֽ�����������
		InputStream in = s.getInputStream();
		//���շ���˷��ص�����  ����
		byte[] bytes = new byte[1024];
		int len = in.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		in.close();
		out.close();
		s.close();
		
	}
}
