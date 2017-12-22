package day14作业_Test2_02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP 服务器端
 */
public class TCPServer {
   public static void main(String[] args) throws Exception {
	   //1创建服务器对象 
	   ServerSocket  ss = new ServerSocket(8002);
	   //2等待客户端连接   如果有客户端连接  获取到客户端对象 
	   Socket socket = ss.accept();
	   
	  
	   
	   //3当前在服务器中  将数据写到流中
	   OutputStream out = socket.getOutputStream();
	   out.write("hello world".getBytes());
	   
	   //释放资源
	   out.close();
//	   ss.close();服务器一般不会关闭
   }
}
