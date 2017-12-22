package cn.itcast01.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 使用字节输入流  读取 一个文本文件  中文的   
 *     一个字节一个字节形式
 *     
 *     文本文件a.txt   4 个字节
 */
public class FileInputStreamDemo {
      public static void main(String[] args) throws IOException {
		 //1:创建字节输入流对象
    	  FileInputStream fis = new FileInputStream("b.txt");
    	  //2:读取数据  使用 一个字节一个字节形式 
    	  int b;
    	  
    	  while((b=fis.read())!=-1){
    		  System.out.println(b);
    	  }
    	  
    	  //3释放资源
    	  fis.close();
	   }
}
