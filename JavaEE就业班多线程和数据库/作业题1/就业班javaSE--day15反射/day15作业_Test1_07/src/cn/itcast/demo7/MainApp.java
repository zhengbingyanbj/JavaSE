package cn.itcast.demo7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/*
 * ��֪ һ�����·�� ��cn.itcast.demo7.User
 *  ���ݸ�·�� ��ȡ��  User����ֽ����ļ�����
 *  �����ֽ������ ��ȡ �� �� �ղι���
 *  ���ݿղι����newInstance���� ͨ�����䷽ʽ��������
 */
public class MainApp {
	public static void main(String[] args) throws Exception {
		 //��ȡ��  User����ֽ����ļ�����
		Class clazz = Class.forName("cn.itcast.demo7.User");
	   //�����ֽ����ļ������ȡ�ղι���
		Constructor cons = clazz.getConstructor();
		//���ݷ����ȡ����
		Object obj = cons.newInstance();
		
	}
}
