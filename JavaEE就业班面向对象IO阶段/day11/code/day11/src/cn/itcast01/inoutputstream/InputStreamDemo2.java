package cn.itcast01.inoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 *   InputStream 
 *     此抽象类是表示字节输入流的所有类的超类。 
 *     
 *       字节输入流的抽象父类 里面定义了 共性的功能
 *        
 *        close() 释放资源 
 *        
 *        int  read() 按照一个字节方式读取 
 *                     每次调用该功能 读取一个字节 
 *                     返回值  就是这次读取到的 字节 
 *        
 *        int read(byte[] buffer) 
 *                 按照字节数组方式 读取 
 *                 传的参数  是用来接收每次读取字节的容器
 *                 返回值      是 每次读取到的真实的字节个数
 *                 
 *        int read(byte[] buffer,int start,int len) 
 *        
 *           |-----FileInputStream  操作文件的字节输入流 
 *                  FileInputStream(String name)
 *                  FileInputStream(File file)
 *      
 */
public class InputStreamDemo2 {
   public static void main(String[] args) throws Exception {
	   //1：创建字节输入流对象
	   FileInputStream fis = new FileInputStream("a.txt");
	   
	   //2: 读取文件
	   /*
	    * 按照一字节数组形式读取
	    */
       //定义一个接收数组  用来接收每次读取到的字节 
	   byte[] buffer = new byte[2];
	   //定义一个接收变量   len  代表 每次 读取到的字节的个数
	   int len;
	   /*
	    *   fis.read(buffer) 按照字节数组 进行读取文件 并将读到字节存到数组中
	    *   len = fis.read(buffer)  每次读到的个数 使用len接收
	    *   ！=-1 如果读完了 len -1
	    */
	   while((len=fis.read(buffer))!=-1){
		    // buffer 数组中 0开始 len个   这些才是 我们真实的字节
		   
		    for(int i = 0;i<len;i++){
		    	System.out.println(buffer[i]);
		    }
	   }
	   
	   //3:释放
	   fis.close();
	   
   }
}
