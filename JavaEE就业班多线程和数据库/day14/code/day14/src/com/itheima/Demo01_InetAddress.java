package com.itheima;

import java.io.IOException;
import java.net.InetAddress;

/*
 * java.net.InetAddress �����ʾ��������ip��ַ
 * 
 * ��̬������������ 
 * 		static InetAddress getLocalHost() ���ر�������
 * 		static InetAddress getByName(String hostName) ����ָ��������IP��ַ����  ���� ������   ip��ַ  ����
 * ���� 
 * 		String getHostName()����������
 * 		String getHostAddress() ����������ַ
 */
public class Demo01_InetAddress {

	public static void main(String[] args) throws IOException {
		//��ȡ��������
		InetAddress host = InetAddress.getLocalHost();
		System.out.println(host);
//		String[] split = host.toString().split("/");
//		System.out.println(split[0]);
//		System.out.println(split[1]);
		//��ȡ������
		System.out.println(host.getHostName());
		//��ȡip��ַ
		System.out.println(host.getHostAddress());
		
		System.out.println("-------------------------------");
		InetAddress host2 = InetAddress.getByName("www.baidu.com");
		System.out.println(host2.getHostName());
		System.out.println(host2);
	}
}
