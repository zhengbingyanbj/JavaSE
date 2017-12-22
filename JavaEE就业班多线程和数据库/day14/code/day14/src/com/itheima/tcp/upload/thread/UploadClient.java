package com.itheima.tcp.upload.thread;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * �ļ��ϴ��ͻ���
 * 
 * ����Դ:d:\\1.jpg
 * ����Ŀ��:�����
 * 
 * 1.�����ͻ��˶��� �󶨷���˵�ַ�Ͷ˿�
 * 2.����FileInputStream����
 * 3.��ȡ�ֽ����������
 * 4.ѭ����д
 * 5.��ȡ�ֽ�����������
 * 6.���շ���˷��ص����� �ϴ��ɹ�
 * 7.����
 */
public class UploadClient {

	public static void main(String[] args) throws  IOException {
		//�����ͻ��˶���
		Socket s = new Socket("127.0.0.1", 9999);
		//����FileInputStream���� ������Դ
		FileInputStream fis = new FileInputStream("d:\\1.jpg");
		//��ȡ�ֽ����������
		OutputStream out = s.getOutputStream();
		//ѭ����д
		byte[] bytes = new byte[1024];
		int len = 0;
		while((len = fis.read(bytes))!=-1){
			out.write(bytes, 0, len);
		}
		
		//��֪������Ѿ�д�����
		s.shutdownOutput();
		
		System.out.println("---------���շ���˷��ص�����--------------");
		//��ȡ�ֽ�����������
		InputStream in = s.getInputStream();
		//���շ���˷��ص����� �ϴ��ɹ�
		int length = in.read(bytes);
		System.out.println(new String(bytes,0,length));
		
		in.close();
		out.close();
		fis.close();
		s.close();
		
	}
}
