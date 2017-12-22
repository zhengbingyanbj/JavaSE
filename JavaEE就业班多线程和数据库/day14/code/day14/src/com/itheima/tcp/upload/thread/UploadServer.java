package com.itheima.tcp.upload.thread;

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
		
		while(true){
			//��ȡ���ӵĿͻ��˶���
			Socket thisSocket = ss.accept();
			//�����߳�������� ���ͻ��˴���ȥ
			UploadTask ut = new UploadTask(thisSocket);
			new Thread(ut).start();
		}
	
		
	}
}













