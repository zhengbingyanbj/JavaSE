package com.itheima.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP的发送端
 *   java.net.DatagramSocket
 *   	构造方法 
 *   		DatagramSocket() 发送端对象
 *   	方法 
 *   		send(DatagramPacket dp) 将数据包发送
 *   java.net.DatagramPacket
 *   	 构造方法
 *   		DatagramPacket(byte[] byte,int length,InetAddress inet,int port)
 *   		参数 
 *   			byte[] byte:数据
 *   			int length:数据长度
 *   			InetAddress inet：接收端ip地址对象
 *  			int port:接收端的端口号
 *  1.准备数据 你好UDP
 *  2.创建数据包对象 
 *  3.创建发送端对象
 *  4.发送端对象调用send方法
 *  5.关流
 */
public class UDPSend {

	public static void main(String[] args) throws IOException {
		//准备数据 你好UDP
		byte[] bytes = "你好UDP".getBytes();
		//创建数据包对象 
		//创建接收端IP地址对象
		InetAddress add = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(bytes,bytes.length,add,8888);
		//创建发送端对象
		DatagramSocket ds = new DatagramSocket();
		//发送端对象调用send方法
		ds.send(dp);
		//关流
		ds.close();
		
	}
}
