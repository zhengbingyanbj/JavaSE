package cn.itcast03.file;

import java.io.File;

/*
 * 
 *  String getAbsolutePath()获取绝对路径 
 *     带盘符的路径
 *  
 *  String getPath()  获取封装路径
 *  
 *  String toString() 
 *  
 *  
 *  相对 绝对概念 
 *     在  封装对象的时候  才有 相对于 绝对  之称  
 *     
 *     绝对  从盘符开启
 *     相对  相对于当前的项目而言
 */
public class FileDemo2 {
    public static void main(String[] args) {
		//使用绝对路径封装a.txt
    	File file = new File("E:\\308\\day10\\a.txt");
    	
    	System.out.println(file.getAbsolutePath());
    	//使用相对路径封装 a.txt
    	File file2 = new File("a.txt");
    	System.out.println(file2.getAbsolutePath());
    	
    	
    	System.out.println("-----------");
    	
    	System.out.println(file.getPath());
    	System.out.println(file2.getPath());
    	
    	System.out.println(file.toString());
	}
}
