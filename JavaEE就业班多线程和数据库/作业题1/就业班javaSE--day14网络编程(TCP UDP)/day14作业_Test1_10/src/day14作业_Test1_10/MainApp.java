package day14��ҵ_Test1_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/*
 * ʹ��UDP�������Ľ��ն�(8888�˿�)������Ϣ��Hello��
 */
public class MainApp {
	public static void main(String[] args) throws IOException {
		// 1: �������Ͷ˵�Socket����
		DatagramSocket ds = new DatagramSocket();
		// 2: ׼�����͵�����
		byte[] bytes = "Hello".getBytes();
		//3:�������ݱ���
		DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName("127.0.0.1"), 8888);
		//�������ݰ�
		ds.send(dp);
		// 4: �ͷ���Դ
		ds.close();
	}
}
