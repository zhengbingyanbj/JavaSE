package cn.itcast01.fileinputstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用字符流 读取中文文件
 *   
 */
public class FileReaderDemo {
   public static void main(String[] args) throws IOException {
	 //1:创建字符输入流对象
	   //FileWriter fw = new FileWriter("d.txt");
	   FileReader fr = new FileReader("b.txt");
	   
	   //2:使用一个字符一个字符形式
	   int ch;
	   
	   while((ch=fr.read())!=-1){
		   System.out.println((char)ch);
	   }
	   
	   //释放
	   fr.close();
  }
}
