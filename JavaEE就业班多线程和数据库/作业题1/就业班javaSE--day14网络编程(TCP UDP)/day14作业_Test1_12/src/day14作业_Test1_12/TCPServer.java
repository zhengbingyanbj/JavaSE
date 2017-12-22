package day14作业_Test1_12;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP 服务器端
 */
public class TCPServer {
   public static void main(String[] args) throws Exception {
	   //1创建服务器对象 
	   ServerSocket  ss = new ServerSocket(8888);
	   //2等待客户端连接   如果有客户端连接  获取到客户端对象 
	   Socket socket = ss.accept();
	  
	   //3当前在服务器中  要读取数据  需要输入流  流由谁提供 客户端
	   InputStream in = socket.getInputStream();//获取输入流
	   //4:读数据
	   int len;
	   byte[] buffer = new byte[1024];
	   while((len=in.read(buffer))!=-1){
		   System.out.println(new String(buffer, 0, len));
	   }
	   
	   //释放资源
	   in.close();
//	   ss.close();服务器一般不会关闭
   }
}
