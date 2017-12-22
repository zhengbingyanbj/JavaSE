package day14作业_Test1_13;

import java.io.OutputStream;
import java.net.Socket;

/*
 * TCP的客户端
 */
public class TCPClient {
  public static void main(String[] args) throws Exception {
	 //创建 Socket客户端对象
	  Socket  socket = new Socket("127.0.0.1", 8888);
	  
	  //写数据  需要输出流  谁提供 客户端
	  OutputStream out = socket.getOutputStream();
	  //写数据
	  out.write("hello.服务器,我是客户端.".getBytes());
	  
	  //释放资源
	  
	  out.close();
	  socket.close();
  }
}
