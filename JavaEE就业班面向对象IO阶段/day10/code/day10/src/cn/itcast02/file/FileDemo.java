package cn.itcast02.file;

import java.io.File;

/*
 *   目录  = 文件夹
 * 
 *   文件和目录路径名的抽象表示形式。
 * 
 *   我们系统中的 文件或者文件夹 在java使用File对象表示 
 *         根据文件或文件夹的 路径 
 *         
 *   File  可以表示 文件 或者文件夹  
 *   
 *     将文件或者文件夹 路径 封装 File对象
 *     构造方法 
 *        File(String pathName) 根据文件的路径名  封装File对象
 *        
 *        File(String parent,String child)
 *              根据 父路径 + 子路径  封装File对象
 *              
 *        File(File parent,String child)
 *           根据父路径的File形式 + 子路径  封装File对象
 */
public class FileDemo {
      public static void main(String[] args) {
		//使用第一种构造 完成 File对象的封装
    	  //将文件封装成File对象
    	  File file = new File("D:\\2017\\308\\day10\\aaa\\破天宝典v4.0.java");
    	  
    	  System.out.println(file);
    	  
    	  //将文件夹封装成File对象
    	  File dir = new File("D:\\2017\\308\\day10\\aaa");
    	  System.out.println(dir);
    	  
    	  File file2 = new File("D:\\2017\\308\\day10\\aaa","破天宝典v4.0.java");
    	  System.out.println(file2);
    	  
    	  File file3 = new File(dir,"破天宝典v4.0.java");
    	  
    	  System.out.println(file3);
	  }
}
