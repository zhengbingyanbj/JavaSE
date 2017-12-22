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
 *        int read(byte[] buffer,int start,int len) 
 *        
 *           |-----FileInputStream  操作文件的字节输入流 
 *                  FileInputStream(String name)
 *                  FileInputStream(File file)
 *      
 */
public class InputStreamDemo {
   public static void main(String[] args) throws Exception {
	   //1：创建字节输入流对象
	   FileInputStream fis = new FileInputStream("a.txt");
	   
	   //2: 读取文件
	   /*
	    * 按照一个一个字节形式读取
	    */
//	   int i1 = fis.read();
//	   System.out.println(i1);
//	   
//	   System.out.println(fis.read());
	   //循环改进
	   // 定义一个 接收变量  接收每次读取到的字节
	   int b;
	   /*
	    *   fis.read()读取文件中的一个字节
	    *   b=fis.read() 使用b接收读取到字节
	    *   !=-1 如果读到了结尾 那么就是-1 
	    */
	   while((b=fis.read())!=-1){
		   System.out.println(b);
	   }
	   
	   //3:释放
	   fis.close();
	   
   }
}
