package cn.itcast04.file;

import java.io.File;

/*
 * 删除功能
 *   boolean delete()
 *   
 *   可以删除文件 以及  （单级）空文件夹
 *   
 *     但是 不经过回收站   慎用
 */
public class FileDemo3 {
      public static void main(String[] args) {
    	  //删除文件
		  File file = new File("a.txt");
		  
		  //删除
		  System.out.println(file.delete());
	     //删除 文件夹
          File  dir = new File("藏经阁\\大理\\段氏");
          
          System.out.println(dir.delete());
      }
}
