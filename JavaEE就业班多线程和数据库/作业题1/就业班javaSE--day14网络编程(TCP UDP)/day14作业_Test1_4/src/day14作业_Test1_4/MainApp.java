package day14作业_Test1_4;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainApp {
   public static void main(String[] args) throws IOException {
	  
	   //获取本机IP对象
	   InetAddress localHost = InetAddress.getLocalHost();
	   //获取本机ip地址和主机名
	   System.out.println("ip地址:"+localHost.getHostAddress());
	   System.out.println("主机名:"+localHost.getHostName());
	   
	 //获取传智播客IP对象
	   InetAddress chuanzhiHost = InetAddress.getByName("www.itcast.cn");
	   //获取传智播客ip地址和主机名
	   System.out.println("ip地址:"+chuanzhiHost.getHostAddress());
	   System.out.println("主机名:"+chuanzhiHost.getHostName());
	   
   }
}
