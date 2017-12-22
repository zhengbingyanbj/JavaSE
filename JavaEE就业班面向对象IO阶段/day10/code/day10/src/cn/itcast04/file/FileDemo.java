package cn.itcast04.file;

import java.io.File;

/*
 * File 
 *   判断功能 
 *      boolean exists() 判断是否存在
 *      boolean isFile() 判断是不是文件
 *      boolean isDirectory() 判断是不是文件夹
 *      
 *      
 *      判断题
 *        一个File对象 不是文件 就是文件夹
 *           不对   
 *           
 *           如果一个File对象代表不存在 路径
 *             那么既不是 文件 也不是文件夹 
 *              
 */ 
public class FileDemo {
    public static void main(String[] args) {
	   //File可以封装 暂时不存在的文件 
    	File file = new File("辟邪剑谱.txt");
    	
    	System.out.println(file);
    	
    	//能不能把  不存在文件 识别出来 
    	System.out.println("文件是否真实存在："+file.exists());
    	
    	File file2 = new File("D:\\2017\\308\\day10\\aaa\\骗你的.java");
    	//判断 是否真实文件
    	System.out.println(file2.exists());
    	
    	//是文件还是文件夹呢 ？
    	System.out.println("file2是文件吗？"+file2.isFile());
    	System.out.println("file2是文件夹吗？"+file2.isDirectory());
    	
    	
    	
	}
}
