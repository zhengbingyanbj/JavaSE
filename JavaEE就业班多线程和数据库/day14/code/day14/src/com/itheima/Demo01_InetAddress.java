package com.itheima;

import java.io.IOException;
import java.net.InetAddress;

/*
 * java.net.InetAddress 此类表示互联网的ip地址
 * 
 * 静态方法创建对象 
 * 		static InetAddress getLocalHost() 返回本地主机
 * 		static InetAddress getByName(String hostName) 返回指定主机名IP地址对象  参数 主机名   ip地址  域名
 * 方法 
 * 		String getHostName()返回主机名
 * 		String getHostAddress() 返回主机地址
 */
public class Demo01_InetAddress {

	public static void main(String[] args) throws IOException {
		//获取本地主机
		InetAddress host = InetAddress.getLocalHost();
		System.out.println(host);
//		String[] split = host.toString().split("/");
//		System.out.println(split[0]);
//		System.out.println(split[1]);
		//获取主机名
		System.out.println(host.getHostName());
		//获取ip地址
		System.out.println(host.getHostAddress());
		
		System.out.println("-------------------------------");
		InetAddress host2 = InetAddress.getByName("www.baidu.com");
		System.out.println(host2.getHostName());
		System.out.println(host2);
	}
}
