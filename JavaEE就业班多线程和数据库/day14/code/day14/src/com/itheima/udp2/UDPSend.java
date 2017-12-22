package com.itheima.udp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 * ģ���������
 */
public class UDPSend {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		//�������Ͷ˶���
		DatagramSocket ds = new DatagramSocket();
		
		while(true){
			//�������������
			String data = sc.nextLine();

			//׼������ ���UDP
			byte[] bytes = data.getBytes();
			//�������ݰ����� 
			//�������ն�IP��ַ����
			InetAddress add = InetAddress.getByName("127.0.0.1");
			DatagramPacket dp = new DatagramPacket(bytes,bytes.length,add,8888);

			//���Ͷ˶������send����
			ds.send(dp);
		}
		
		
		
		//����
//		ds.close();
		
	}
}
