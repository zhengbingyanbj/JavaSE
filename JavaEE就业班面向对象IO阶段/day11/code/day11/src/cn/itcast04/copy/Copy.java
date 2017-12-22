package cn.itcast04.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *                     复制方式
 *   基本流                一个字节一个字节            1476.636  s
 *                  字节数组                         1.382s
 *   
 *   高效流                一个字节一个字节             3.615s
 *                  字节数组                          0.329s
 */
public class Copy {
  public static void main(String[] args) throws IOException {
	  // 源文件
	   File srcFile = new File("妮儿别跳呗.mp4");
	  // 目标文件
	   File destFile = new File("copy\\copy4.mp4");
	  
	  //记录开始时间
	  
	  long start = System.currentTimeMillis();
	  // 将 源文件中的数据 复制到 目标文件中 
		copy4(srcFile,destFile);
	  //记录结束时间
	  long end = System.currentTimeMillis();
	  
	  System.out.println("耗时："+Math.abs((start-end))+"毫秒");
  }
    /*
     *  文件复制 采用基本流 一个字节一个字节形式
     */
	public static void copy1(File srcFile, File destFile) throws IOException {
		 //创建字节输入流关联源文件
		FileInputStream fis = new FileInputStream(srcFile);
		//创建字节输出流 关联目标文件
		FileOutputStream fos = new FileOutputStream(destFile);
		
		//读数据 
		int b;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		//释放资源
		fis.close();
		fos.close();
	}
	
	/*
     *  文件复制 采用基本流 字节数组形式
     */
	public static void copy2(File srcFile, File destFile) throws IOException {
		 //创建字节输入流关联源文件
		FileInputStream fis = new FileInputStream(srcFile);
		//创建字节输出流 关联目标文件
		FileOutputStream fos = new FileOutputStream(destFile);
		
		//读数据 
		byte[] buffer = new byte[1024];
		int len;
		
		while((len=fis.read(buffer))!=-1){
			fos.write(buffer, 0, len);
		}
		//释放资源
		fis.close();
		fos.close();
	}
	
	 /*
     *  文件复制 采用高效流 一个字节一个字节形式
     */
	public static void copy3(File srcFile, File destFile) throws IOException {
		 //创建字节输入流关联源文件
		FileInputStream fis = new FileInputStream(srcFile);
		BufferedInputStream bis = new BufferedInputStream(fis);
		//创建字节输出流 关联目标文件
		FileOutputStream fos = new FileOutputStream(destFile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//读数据 
		int b;
		while((b=bis.read())!=-1){
			bos.write(b);
		}
		//释放资源
		bos.close();
		fos.close();
		bis.close();
		fis.close();
	}
	
	 /*
     *  文件复制 采用高效流 字节数组形式
     */
	public static void copy4(File srcFile, File destFile) throws IOException {
		 //创建字节输入流关联源文件
		FileInputStream fis = new FileInputStream(srcFile);
		BufferedInputStream bis = new BufferedInputStream(fis);
		//创建字节输出流 关联目标文件
		FileOutputStream fos = new FileOutputStream(destFile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//读数据 
		byte[] buffer = new byte[1024];
		int len;
		
		while((len=bis.read(buffer))!=-1){
			bos.write(buffer, 0, len);
		}
		//释放资源
		bos.close();
		fos.close();
		bis.close();
		fis.close();
	}
}
