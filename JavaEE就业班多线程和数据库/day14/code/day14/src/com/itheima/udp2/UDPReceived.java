package com.itheima.udp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP的接收端
 * 
 */
public class UDPReceived {

	public static void main(String[] args) throws IOException {

		//创建接收端对象
		DatagramSocket ds = new DatagramSocket(8888);
		while(true){
			//创建接收端数据包对象
			byte[] bytes = new byte[1024*64];
			DatagramPacket dp = new DatagramPacket( bytes, bytes.length);
			//接收端对象调用receive方法接收数据包
			ds.receive(dp);

			//拆包
			//获取长度
			int length = dp.getLength();
			//发送端ip地址
			InetAddress address = dp.getAddress();
			//发送端端口号
			int port = dp.getPort();
			
			System.out.println(address.toString()+":"+port+" "+new String(bytes,0,length));
			
		}
		
		
//		ds.close();
	}
}
