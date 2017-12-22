package day14作业_Test2_02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * TCP的客户端
 */
public class TCPClient {
  public static void main(String[] args) throws Exception {
	 //创建 Socket客户端对象
	  Socket  socket = new Socket("127.0.0.1", 8002);
	  
	  //读服务器数据  
	  InputStream in = socket.getInputStream();//获取输入流
	   //读数据
	   
	   byte[] buffer = new byte[1024];
	   int len = in.read(buffer); 
	   System.out.println(new String(buffer, 0, len));
	   
	  
	  
	  //释放资源
	  
	  in.close();
	  socket.close();
  }
}
