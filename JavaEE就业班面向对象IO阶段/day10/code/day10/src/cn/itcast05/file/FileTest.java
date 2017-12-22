package cn.itcast05.file;

import java.io.File;

/*
 *   指定目录
 *   D:\2017\308\day10\aaa
 *   
 *   获取这个目录下  所有.java文件  （单级）
 *       打印绝对路径
 */
public class FileTest {
     public static void main(String[] args) {
		 //先封装指定目录
    	 File dir = new File("D:\\2017\\308\\day10\\aaa");
    	 //通过listFile方法 获取当级目录下 所有文件和文件夹
    	 File[] files = dir.listFiles();
    	 
    	 for (File file : files) {
			  
    		 //先判断是不是文件
    		 if(file.isFile()){
    			 String name = file.getName();
    			 if(name.endsWith(".java")){//判断是不是以.java结尾
    				 System.out.println(file.getAbsolutePath());
    			 }
    		 }
		  }
	 }
}
