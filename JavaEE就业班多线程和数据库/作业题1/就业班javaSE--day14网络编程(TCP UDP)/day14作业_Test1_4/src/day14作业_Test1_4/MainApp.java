package day14��ҵ_Test1_4;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainApp {
   public static void main(String[] args) throws IOException {
	  
	   //��ȡ����IP����
	   InetAddress localHost = InetAddress.getLocalHost();
	   //��ȡ����ip��ַ��������
	   System.out.println("ip��ַ:"+localHost.getHostAddress());
	   System.out.println("������:"+localHost.getHostName());
	   
	 //��ȡ���ǲ���IP����
	   InetAddress chuanzhiHost = InetAddress.getByName("www.itcast.cn");
	   //��ȡ���ǲ���ip��ַ��������
	   System.out.println("ip��ַ:"+chuanzhiHost.getHostAddress());
	   System.out.println("������:"+chuanzhiHost.getHostName());
	   
   }
}
