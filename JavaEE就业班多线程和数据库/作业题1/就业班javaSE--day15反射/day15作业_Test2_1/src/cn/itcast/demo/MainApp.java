package cn.itcast.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;
/*
 * ��дһ����A������һ��ʵ������showString,���ڴ�ӡһ���ַ�����
 * �ڱ�дһ����TestA ,��Ϊ�ͻ��ˣ��ü�������һ���ַ��������ַ���������A��ȫ����ʹ�÷�����ƴ�������Ķ���
  * �����øö����еķ���showString
 */
public class MainApp {
	public static void main(String[] args) throws Exception {
		System.out.println("��¼��һ�����·��:");
		// ����¼��cn.itcast.demo.A
		String className = new Scanner(System.in).nextLine();
		
		 //��ȡ��  User����ֽ����ļ�����
		Class clazz = Class.forName(className);
	   //�����ֽ����ļ������ȡ�ղι���
		Constructor cons = clazz.getConstructor();
		//���ݷ����ȡ����
		Object obj = cons.newInstance();
		
		//���ݷ����ȡ�÷��� 
		Method method = clazz.getMethod("showString");
		
		method.invoke(obj);
	}
}
