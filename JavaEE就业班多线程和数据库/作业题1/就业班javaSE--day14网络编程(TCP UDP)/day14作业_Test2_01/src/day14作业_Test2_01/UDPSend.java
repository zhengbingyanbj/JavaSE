package day14��ҵ_Test2_01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP�ķ��Ͷ�  
 *    �������Ͷ˶��� 
 *   
  1������UDP��Socket���� 
  2����Ҫ���͵����ݷ�װ�����ݰ��У� 
  3��ͨ��UDP��Socket�������ݰ����ͳ�ȥ�� 
  4���ر�Socket����
 *     
 */
public class UDPSend {
   public static void main(String[] args) throws Exception {
	    //�������Ͷ˶���
	   DatagramSocket  socket = new DatagramSocket();
	   //���� ���ݱ����� ��װ����
	   String s = "hello~~����յ�����";
	   
	   //������װ�� 
	   /*
	    * byte[] buf  �㴫������� Ҫʹ���ֽ����� ��װ
	    * int length  �������ж�������Ҫ����
	    * InetAddress address  ���ն˵�ip��ַ 
	    */
	   byte[] buf = s.getBytes();
	   int length = buf.length;
	   InetAddress address = InetAddress.getByName("127.0.0.1");
	   int port = 12306;
	   DatagramPacket dp = new DatagramPacket(buf, length, address, port);
	   
	   //ʹ�÷��Ͷ˶�����з��� 
	   socket.send(dp);
	   
	   //�ر�socket
	   socket.close();
   }
}
