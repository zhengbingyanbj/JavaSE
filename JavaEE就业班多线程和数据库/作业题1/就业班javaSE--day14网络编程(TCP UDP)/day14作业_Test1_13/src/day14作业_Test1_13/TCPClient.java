package day14��ҵ_Test1_13;

import java.io.OutputStream;
import java.net.Socket;

/*
 * TCP�Ŀͻ���
 */
public class TCPClient {
  public static void main(String[] args) throws Exception {
	 //���� Socket�ͻ��˶���
	  Socket  socket = new Socket("127.0.0.1", 8888);
	  
	  //д����  ��Ҫ�����  ˭�ṩ �ͻ���
	  OutputStream out = socket.getOutputStream();
	  //д����
	  out.write("hello.������,���ǿͻ���.".getBytes());
	  
	  //�ͷ���Դ
	  
	  out.close();
	  socket.close();
  }
}
