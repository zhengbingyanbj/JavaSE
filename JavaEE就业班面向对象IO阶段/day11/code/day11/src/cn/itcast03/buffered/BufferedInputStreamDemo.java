package cn.itcast03.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*
 * BufferedInputStream 
 *   高效的字节输入流   
 *      提高基本流的  读取效率  
 *      
 *      InputStream 的子类 
 *      
 *      BufferedInputStream(InputStream in)
 */
public class BufferedInputStreamDemo {
   public static void main(String[] args) throws Exception {
	  //创建 高效的字节输入流
	   BufferedInputStream bis = new BufferedInputStream(new  FileInputStream("b.txt"));
	   //读取 
	   byte[] buffer = new byte[1024];
	   
	   int len;
	   
	   while((len=bis.read(buffer))!=-1){
		   
		   for(int i = 0;i<len;i++){
			   System.out.println(buffer[i]);
		   }
	   }
	   //关闭流
	   bis.close();
   }
}
