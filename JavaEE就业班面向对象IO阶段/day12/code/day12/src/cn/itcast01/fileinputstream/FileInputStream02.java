package cn.itcast01.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream02 {
   public static void main(String[] args) throws IOException {
	 //创建字节输入流对象
	   FileInputStream fis = new FileInputStream("a.txt");
	  //使用数组方式读取
	   
	   byte[] buffer = new byte[1024];
	   
	   int len = fis.read(buffer);
	   
	   //buffer  0  len 
	   //public String(byte[] bytes, int startIndex,  int length) 把字节数组一部分元素 转换成字符串
	   
	   String s = new String(buffer,0,len);//字符串构造中完成 解码操作   将字节 按照 默认的编码集转换成  字符
	   
	   System.out.println(s);
	   //释放
	   fis.close();
	   
   }
}
