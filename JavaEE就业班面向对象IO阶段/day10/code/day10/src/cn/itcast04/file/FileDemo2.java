package cn.itcast04.file;

import java.io.File;
import java.io.IOException;

/*
 * File 
 *   创建功能
 *     boolean creatNewFile() 创建新文件  并判断是否成功
 *     boolean mkdir() 创建新的文件夹  （单级）并判断是否成功
 *     boolean mkdirs() 创建多级文件夹 并判断是否成功
 */
public class FileDemo2 {
  public static void main(String[] args) throws IOException {
	//File可以封装 暂时不存在的文件 
  	File file = new File("辟邪剑谱.txt");
  	//原本不存在这个文件   我可以通过 java代码  完成文件创建
  	
  	boolean b = file.createNewFile();
  	
  	if(b){
  		System.out.println("创建文件成功："+file.isFile());
  	}else{
  		System.out.println("创建文件失败");
  	}
  	
  	System.out.println("-----------------");
  	// 创建 一个文件夹 叫做 藏经阁
  	//1::创建一个 要被创建的 文件夹的 路径  对象
    File dir = new File("藏经阁");
    //2：调用mkdir功能 完成创建 单级文件夹
    boolean c = dir.mkdir();
    if(c){
    	System.out.println("创建 文件夹成功："+dir.isDirectory());
    }else{
    	System.out.println("创建文件夹失败");
    }
    System.out.println("----------------");
    //创建多级文件夹  
    File dirs = new File("aa\\bb\\cc");
    //2：调用mkdir功能 完成创建 单级文件夹
    boolean d = dirs.mkdirs();
    if(d){
    	System.out.println("创建 多级文件夹成功："+dirs.isDirectory());
    }else{
    	System.out.println("创建多级文件夹失败");
    }
    System.out.println("----------------");
   }
}
