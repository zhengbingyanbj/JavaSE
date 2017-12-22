package day14作业_Test1_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/*
 * 使用UDP给本机的接收端(8888端口)发送信息“Hello”
 */
public class MainApp {
	public static void main(String[] args) throws IOException {
		// 1: 创建发送端的Socket对象
		DatagramSocket ds = new DatagramSocket();
		// 2: 准备发送的数据
		byte[] bytes = "Hello".getBytes();
		//3:创建数据报包
		DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName("127.0.0.1"), 8888);
		//发送数据包
		ds.send(dp);
		// 4: 释放资源
		ds.close();
	}
}
