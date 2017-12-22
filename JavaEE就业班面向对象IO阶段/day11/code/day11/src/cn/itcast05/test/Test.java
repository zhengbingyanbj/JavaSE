package cn.itcast05.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 *    将 藏经阁中 目录中第一层  内容 
 *       复制到 博学谷中 
 *       
 *       只复制单级目录下的
 */
public class Test {
      public static void main(String[] args) throws IOException {
		  //1: 封装 源文件夹   
    	  File srcDir = new File("藏经阁");
    	  // 封装 目标文件夹
    	  File destDir = new File("博学谷");
    	  
    	  copyDir(srcDir,destDir);
	   }
      /*
       *   完成  单级文件夹复制操作的
       */
	  public static void copyDir(File srcDir, File destDir) throws IOException {
		  // 做一个健壮性判断
		  if(!srcDir.isDirectory() || !destDir.isDirectory()){
			  return;
		  }
		  
		  //2.1获取 源文件夹中 所有的File对象
		  File[] files = srcDir.listFiles();
		  
		  //2.2遍历 得到每一个file对象 
		  for (File file : files) {
			  //file就是 遍历出来的对象
			  //2.2.1判断是文件  
			  if(file.isFile()){
				  //是文件  file作为源文件  完成复制
				  File srcFile = file;
				  
				  //  确定目标文件  在目标文件夹中  名字跟源文件名一样
				  File destFile = new File(destDir,file.getName());
				  //完成文件复制
				  copyFile(srcFile, destFile);
			  }  
			  
			  //2.3 判断是否是文件夹  
			  if(file.isDirectory()){
				  //file是一个文件夹 
				  //需要在目标文件夹中 创建一个名字跟file一样的文件夹 并且 mkdir
				  File dir = new File(destDir,file.getName());
				  dir.mkdir();
			  }
		  }
	  }
	  
	  public static void copyFile(File srcFile, File destFile) throws IOException {
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
