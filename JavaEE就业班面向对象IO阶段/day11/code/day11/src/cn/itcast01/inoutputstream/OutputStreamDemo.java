package cn.itcast01.inoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *   流的操作规律
 *     1：创建 流对象
 *     2：执行对应操作
 *     3：释放资源      (从后往前  从小到大)
 *     
 *    OutputStream 
 *      此抽象类是表示输出字节流的所有类的超类
 *      
 *         字节输出流的 抽象 父类    定义了所有字节输出流应该具备的功能 
 *         
 *         close() 释放资源
 *         flush() 刷新
 *         
 *        void write(int b) 按照字节方式 写出去  只不过使用int接收那个字节而已
 *        void write(byte[] bys) 按照字节数组方式写出去  
 *        void write(byte[] bys,int start,int len)按照字节数组一部分写出去
 *        
 *          |---FileOutputStream  操作文件字节输出流
 *          
 *              构造 
 *                FileOutputStream(String name)
 *                FileOutputStream(File file)
 * 
 */
public class OutputStreamDemo {
        public static void main(String[] args) throws IOException {
			//1:创建 字节输出流对象
        	FileOutputStream fos = new FileOutputStream("a.txt");
        	//2：写数据
//        	fos.write(97);
//        	fos.write(98);
        	
        	String s = "abcde";
        	//GBK规则 一个中文汉字 占用两个字节
        	//byte[] getBytes() 把该字符串 转换成 字节数组
        	byte[] bys = s.getBytes();
        	
        	fos.write(bys);
        	
        	//3:释放资源
        	fos.close();
        	
        	
        	
        	
        	
		}
}
