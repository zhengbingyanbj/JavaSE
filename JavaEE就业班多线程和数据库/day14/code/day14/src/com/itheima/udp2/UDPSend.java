package com.itheima.udp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 * 模拟简易聊天
 */
public class UDPSend {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		//创建发送端对象
		DatagramSocket ds = new DatagramSocket();
		
		while(true){
			//接收输入的数据
			String data = sc.nextLine();

			//准备数据 你好UDP
			byte[] bytes = data.getBytes();
			//创建数据包对象 
			//创建接收端IP地址对象
			InetAddress add = InetAddress.getByName("127.0.0.1");
			DatagramPacket dp = new DatagramPacket(bytes,bytes.length,add,8888);

			//发送端对象调用send方法
			ds.send(dp);
		}
		
		
		
		//关流
//		ds.close();
		
	}
}
