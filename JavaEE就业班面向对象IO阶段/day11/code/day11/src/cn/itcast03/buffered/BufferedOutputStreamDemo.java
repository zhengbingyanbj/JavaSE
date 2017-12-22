package cn.itcast03.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  
 *    BufferedOutputStream  
 *       高效的 字节输出流   提高 原来基本流的 写的效率
 *       
 *       
 *       设计上 
 *         OutputStream是 BufferedOutputStream父类
 *         
 *         BufferedOutputStream(OutputStream out)
 *         
 *             
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
	    //1:创建 高效的字节输出流 对象
    	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));
    	//2:读取
    	String s = "kobebranyt";
    	bos.write(s.getBytes());
    	//3:释放
    	bos.close();
    	
	}
}
