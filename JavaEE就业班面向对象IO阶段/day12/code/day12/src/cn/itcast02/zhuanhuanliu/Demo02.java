package cn.itcast02.zhuanhuanliu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/*
 *  字符流  = 字节流+编码表; 
 * 
 *   字符流的体系  
 *      方便程序员的流
 *      每次 操作的时候  读  或者 写 都直接操作的是 字符 不再是字节
 *      
 *      |----Reader  字符输入流  抽象父类
 *             共性功能   读一个字符   读一个字符数组  按照字符数组一部分读取
 *             |----InputSteamReader  字符输入流  
 *                      转换流
 *                      字节流通向字符流的桥梁 
 *                      将文本(字节)文件中的 字节读到流中 通过“指定编码表” 转换成 对应的字符 
 *                  |---FileReader  字符输入流  
 *                        字符输入流的便捷类
 *                         将文本(字节)文件中的 字节读到流中 通过默认编码表  转换成 对应的字符 
 *             
 *      |----Writer  字符输出流  抽象父类
 *             共性功能   写一个字符  写一个字符数组  写一个字符串  。。。。
 *             |----OutputStreamWriter  字符输出流
 *                       转换流
 *                       字符流通向字节流的桥梁
 *                       将字符 根据 “指定编码表” 转换成对应的字节 通过字节输出流写入文件中
 *                  |---FileWriter 字符输出流
 *                        字符输出流的便捷类
 *                        将字符 根据 默认编码表 转换成对应的字节 通过字节输出流写入文件中
 *                   
 *                    用来写入字符文件的便捷类。此类的构造方法假定默认字符编码
 *                  
 * 
 */
public class Demo02 {
   public static void main(String[] args) throws IOException {
	   /*
	    * 使用字符输入流转换流 读取 指定编码 集  utf-8 文件  utf8.txt
	    *    InputStreamReader 
	    */
	   //创建对象
	   InputStreamReader isr = new InputStreamReader(new FileInputStream("utf8.txt"),"utf-8");
       //读取 
	   char[] buffer = new char[1024];
	   int len;
	   
	   while((len=isr.read(buffer))!=-1){
		   
		   String s = new String(buffer,0,len);
		   System.out.println(s);
	   }
	   
	   //释放资源
	   isr.close();
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
