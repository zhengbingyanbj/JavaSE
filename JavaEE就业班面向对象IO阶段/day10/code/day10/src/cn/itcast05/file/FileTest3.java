package cn.itcast05.file;

import java.io.File;

/*
 *   指定目录
 *   D:\2017\308\day10\aaa
 *   
 *   获取这个目录下  所有.java文件  （多级）
 *       打印绝对路径
 */
public class FileTest3 {
     public static void main(String[] args) {
		 //先封装指定目录
    	 File dir = new File("D:\\2017\\308\\day10\\aaa");
    	 
    	 getJavaFileByDir(dir);
	 }
     /*
      * 传递一个 目录  
      *    打印 该目录下 所有的.java文件
      */
     public static void getJavaFileByDir(File dir){
    	 
    	 if(!dir.isDirectory()){
    		 return;
    	 }
    	 
    	 //获取当前目录下 所有文件及子文件夹 File对象形式
    	 File[] files = dir.listFiles();
    	 for (File file : files) {
		    //file  是该目录下的 文件或文件夹  对象
    		 
    		 if(file.isFile()){//判断是否是文件
    			 
    			 String name = file.getName();
    			 
    			 if(name.endsWith(".java")){
    				 System.out.println(file.getAbsolutePath());
    			 }
    			 
    			 
    		 }
    		 
    		 
    		 if(file.isDirectory()){//判断是否是文件夹
    			 
    			 //调用   传递 文件夹  打印 符合要求 文件的功能
    			 getJavaFileByDir(file);
    		 }
    		 
		 }
     }
}
