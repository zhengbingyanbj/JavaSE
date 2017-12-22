package com.itheima.udp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP�Ľ��ն�
 * 
 */
public class UDPReceived {

	public static void main(String[] args) throws IOException {

		//�������ն˶���
		DatagramSocket ds = new DatagramSocket(8888);
		while(true){
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
			
		}
		
		
//		ds.close();
	}
}
