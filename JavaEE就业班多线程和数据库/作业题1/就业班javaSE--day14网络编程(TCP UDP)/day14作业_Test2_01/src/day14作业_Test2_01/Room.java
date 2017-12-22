package day14作业_Test2_01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * UDP接收端 
 */
public class Room {
  public static void main(String[] args) throws Exception {
	  //创建DatagramSocket 作为接收端  指定 端口号
	  
	  DatagramSocket socket = new DatagramSocket(12306);
	  
	  System.out.println("聊足球的地方,大家畅所欲言:");
	  while(true){
		//创建一个空的数据报 对象
		  byte[] buf = new byte[1024];
		  DatagramPacket  dp = new DatagramPacket(buf, 1024);
		  
		  //接收
		  socket.receive(dp);//这个方法 阻塞 如果没有人发送  阻塞 接收到  通了 就
		  
		  //现在数据在dp中
		  //1:发送端的ip地址 
		  String sendIp = dp.getAddress().getHostAddress();
		  //获取 发送端 ip地址 的字符串表示形式
		  System.out.println("发送端ip是:"+sendIp);
		  
		  //3: 获取数据缓冲区
		  byte[] data = dp.getData();
		  //4: 获取缓冲区接收的字节个数 
		  int length = dp.getLength();
		  
		  //data  0 length 
		  System.out.println(sendIp+" 说:"+new String(data,0,length));
	  }
	  
	  
	
}
}
