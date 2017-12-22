package cn.itcast.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/*
 * 已知 一个类的路径 是cn.itcast.demo.User
 *  根据该路径 获取到  User类的字节码文件对象
 */
public class MainApp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 //
		Class clazz = Class.forName("cn.itcast.demo.User");
	   
		
	}
}
