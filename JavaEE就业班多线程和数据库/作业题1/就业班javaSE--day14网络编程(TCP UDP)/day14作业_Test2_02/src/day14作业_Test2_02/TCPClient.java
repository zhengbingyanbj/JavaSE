package day14��ҵ_Test2_02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * TCP�Ŀͻ���
 */
public class TCPClient {
  public static void main(String[] args) throws Exception {
	 //���� Socket�ͻ��˶���
	  Socket  socket = new Socket("127.0.0.1", 8002);
	  
	  //������������  
	  InputStream in = socket.getInputStream();//��ȡ������
	   //������
	   
	   byte[] buffer = new byte[1024];
	   int len = in.read(buffer); 
	   System.out.println(new String(buffer, 0, len));
	   
	  
	  
	  //�ͷ���Դ
	  
	  in.close();
	  socket.close();
  }
}
