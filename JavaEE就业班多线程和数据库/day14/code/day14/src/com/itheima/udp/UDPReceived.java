package com.itheima.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP�Ľ��ն�
 * 	java.net.DatagramSocket 
 * 		 ���췽��
 * 			DatagramSocket(int port) ���ն˶���
 * 		����
 * 			void receive(DatagramPacket p) �������ݰ�
 * 	java.net.DatagramPacket
 * 		���췽��
 * 			DatagramPacket(byte[] buf, int length) 
 * 
 * 1.�������ն˶���
 * 2.�������ն����ݰ�����
 * 3.���ն˶������receive�����������ݰ�
 * 4.���
 * 		DatagramPacket�� 
 * 			getLength() ��ȡ���� 
 * 			getAddress() ��ȡip��ַ
 * 			getPort() ��ȡ���Ͷ˶˿ں�
 * 5.����
 * 
 */
public class UDPReceived {

	public static void main(String[] args) throws IOException {
		//�������ն˶���
		DatagramSocket ds = new DatagramSocket(8888);
		//�������ն����ݰ�����
		byte[] bytes = new byte[1024*64];
		DatagramPacket dp = new DatagramPacket( bytes, bytes.length);
		
		//���ն˶������receive�����������ݰ�
		ds.receive(dp);
		
		//���
		//��ȡ����
		int length = dp.getLength();
		//���Ͷ�ip��ַ
		InetAddress address = dp.getAddress();
		//���Ͷ˶˿ں�
		int port = dp.getPort();
		
		System.out.println(address.toString()+":"+port+" "+new String(bytes,0,length));
		
		ds.close();
	}
}
