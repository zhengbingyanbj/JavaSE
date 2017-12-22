package day14作业_Test2_01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP的发送端  
 *    创建发送端对象 
 *   
  1、建立UDP的Socket服务； 
  2、将要发送的数据封装到数据包中； 
  3、通过UDP的Socket服务将数据包发送出去； 
  4、关闭Socket服务
 *     
 */
public class UDPSend {
   public static void main(String[] args) throws Exception {
	    //创建发送端对象
	   DatagramSocket  socket = new DatagramSocket();
	   //创建 数据报包并 封装数据
	   String s = "hello~~你接收到了吗";
	   
	   //创建集装箱 
	   /*
	    * byte[] buf  你传输的数据 要使用字节数组 包装
	    * int length  数组中有多少数据要传输
	    * InetAddress address  接收端的ip地址 
	    */
	   byte[] buf = s.getBytes();
	   int length = buf.length;
	   InetAddress address = InetAddress.getByName("127.0.0.1");
	   int port = 12306;
	   DatagramPacket dp = new DatagramPacket(buf, length, address, port);
	   
	   //使用发送端对象进行发送 
	   socket.send(dp);
	   
	   //关闭socket
	   socket.close();
   }
}
