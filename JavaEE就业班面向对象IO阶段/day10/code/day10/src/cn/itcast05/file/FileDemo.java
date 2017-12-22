package cn.itcast05.file;

import java.io.File;

/*
 *   File 高级获取功能 
 *       对目录（文件夹）来说
 *       
 *     String[] list() 获取当前目录下的 文件及文件夹  名字列表 使用String数组接收
 *     File[] listFiles() 获取当前目录下的  文件及文件夹 对象列表 使用File对象数组接收
 */
public class FileDemo {
    public static void main(String[] args) {
		//创建 File  指定目录对象
    	File dir = new File("D:\\2017\\308\\day10\\aaa");
    	
    	String[] list = dir.list();
    	System.out.println(list.length);
    	for (String name : list) {
			System.out.println(name);
		}
    	
    	System.out.println("--------");
    	File[] files = dir.listFiles();
    	for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
