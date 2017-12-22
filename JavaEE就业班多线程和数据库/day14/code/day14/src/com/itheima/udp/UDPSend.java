package com.itheima.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP�ķ��Ͷ�
 *   java.net.DatagramSocket
 *   	���췽�� 
 *   		DatagramSocket() ���Ͷ˶���
 *   	���� 
 *   		send(DatagramPacket dp) �����ݰ�����
 *   java.net.DatagramPacket
 *   	 ���췽��
 *   		DatagramPacket(byte[] byte,int length,InetAddress inet,int port)
 *   		���� 
 *   			byte[] byte:����
 *   			int length:���ݳ���
 *   			InetAddress inet�����ն�ip��ַ����
 *  			int port:���ն˵Ķ˿ں�
 *  1.׼������ ���UDP
 *  2.�������ݰ����� 
 *  3.�������Ͷ˶���
 *  4.���Ͷ˶������send����
 *  5.����
 */
public class UDPSend {

	public static void main(String[] args) throws IOException {
		//׼������ ���UDP
		byte[] bytes = "���UDP".getBytes();
		//�������ݰ����� 
		//�������ն�IP��ַ����
		InetAddress add = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(bytes,bytes.length,add,8888);
		//�������Ͷ˶���
		DatagramSocket ds = new DatagramSocket();
		//���Ͷ˶������send����
		ds.send(dp);
		//����
		ds.close();
		
	}
}
