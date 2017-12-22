package cn.itcast04.print;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 
 * PrintStream  字节打印流
 *    System.out 是一个通道    从程序 通向 控制台的 一个通道
 * PrintWriter  字符打印流  也是一个字符输出流
 * 
 *       print() 直接输出  println()输出后换行 
 *       
 *       write() 输出   
 *       
 *       print println可以写任何类型
 *       write写的范围小
 *       
 *       
 */
public class PrintDemo {
  public static void main(String[] args) throws IOException {
	  
//	  System.out.println();
	  //创建字符输出流对象
	  PrintWriter pw = new PrintWriter("nba.txt");//通向哪里 数据就到哪里
	  //写数据
	  pw.write("凯文杜软特");
	  pw.println(new Object());
	  pw.print(true);
	  //释放资源
	  pw.close();
   }
}
