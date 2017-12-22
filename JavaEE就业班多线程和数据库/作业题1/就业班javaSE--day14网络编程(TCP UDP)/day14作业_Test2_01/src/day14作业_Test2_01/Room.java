package day14��ҵ_Test2_01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * UDP���ն� 
 */
public class Room {
  public static void main(String[] args) throws Exception {
	  //����DatagramSocket ��Ϊ���ն�  ָ�� �˿ں�
	  
	  DatagramSocket socket = new DatagramSocket(12306);
	  
	  System.out.println("������ĵط�,��ҳ�������:");
	  while(true){
		//����һ���յ����ݱ� ����
		  byte[] buf = new byte[1024];
		  DatagramPacket  dp = new DatagramPacket(buf, 1024);
		  
		  //����
		  socket.receive(dp);//������� ���� ���û���˷���  ���� ���յ�  ͨ�� ��
		  
		  //����������dp��
		  //1:���Ͷ˵�ip��ַ 
		  String sendIp = dp.getAddress().getHostAddress();
		  //��ȡ ���Ͷ� ip��ַ ���ַ�����ʾ��ʽ
		  System.out.println("���Ͷ�ip��:"+sendIp);
		  
		  //3: ��ȡ���ݻ�����
		  byte[] data = dp.getData();
		  //4: ��ȡ���������յ��ֽڸ��� 
		  int length = dp.getLength();
		  
		  //data  0 length 
		  System.out.println(sendIp+" ˵:"+new String(data,0,length));
	  }
	  
	  
	
}
}
