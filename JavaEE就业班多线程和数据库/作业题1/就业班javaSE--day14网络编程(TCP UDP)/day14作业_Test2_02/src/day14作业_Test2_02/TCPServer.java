package day14��ҵ_Test2_02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP ��������
 */
public class TCPServer {
   public static void main(String[] args) throws Exception {
	   //1�������������� 
	   ServerSocket  ss = new ServerSocket(8002);
	   //2�ȴ��ͻ�������   ����пͻ�������  ��ȡ���ͻ��˶��� 
	   Socket socket = ss.accept();
	   
	  
	   
	   //3��ǰ�ڷ�������  ������д������
	   OutputStream out = socket.getOutputStream();
	   out.write("hello world".getBytes());
	   
	   //�ͷ���Դ
	   out.close();
//	   ss.close();������һ�㲻��ر�
   }
}
