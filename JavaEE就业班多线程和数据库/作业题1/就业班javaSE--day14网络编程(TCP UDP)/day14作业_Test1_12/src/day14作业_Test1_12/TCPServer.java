package day14��ҵ_Test1_12;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP ��������
 */
public class TCPServer {
   public static void main(String[] args) throws Exception {
	   //1�������������� 
	   ServerSocket  ss = new ServerSocket(8888);
	   //2�ȴ��ͻ�������   ����пͻ�������  ��ȡ���ͻ��˶��� 
	   Socket socket = ss.accept();
	  
	   //3��ǰ�ڷ�������  Ҫ��ȡ����  ��Ҫ������  ����˭�ṩ �ͻ���
	   InputStream in = socket.getInputStream();//��ȡ������
	   //4:������
	   int len;
	   byte[] buffer = new byte[1024];
	   while((len=in.read(buffer))!=-1){
		   System.out.println(new String(buffer, 0, len));
	   }
	   
	   //�ͷ���Դ
	   in.close();
//	   ss.close();������һ�㲻��ر�
   }
}
