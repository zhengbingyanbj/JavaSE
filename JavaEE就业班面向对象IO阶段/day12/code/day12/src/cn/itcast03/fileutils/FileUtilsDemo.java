package cn.itcast03.fileutils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/*
 *  在开发中 很多代码 执行的操作 都是一样的  
 *    大家都使用这种操作 
 *      这个时候有些组织 比如 阿帕奇组织   （雷锋）
 *      把很多功能进行了实现    封装到一些类中 
 *      
 *      只要我们可以找到这些类 调用别人写好的方法  我们就不用写了
 *      
 *      那么 怎么使用别人的类呢  
 *      
 *      别人的类  写到jar包中 
 *       是一种压缩文件  
 *        .class的压缩文件 
 *        
 *        commons-io-2.4.jar
 *      导包操作 三步  
 *        1：在当前项目下 创建一个文件夹 lib
 *        2：复制commons-io-2.4.jar到lib下
 *        3：对这个jar点右键 build path--add to build path
 *           出现小奶瓶 就OK 了 
 *           
 *         FileUtils 工具类   专门帮助我们完成 文件一些操作的 
 *         方法都是静态
 *         
 *         readFileToString(File file)：读取文件内容，并返回一个String；
 *         writeStringToFile(File file，String content)：将内容content写入到file中；
 *         copyDirectoryToDirectory(File srcDir,File destDir);文件夹复制
 *         copyFile(File srcFile, File destFile): 文件复制
 */
public class FileUtilsDemo {
        public static void main(String[] args) throws IOException {
//			//一句话搞定文件复制 
//        	File srcFile = new File("破天宝典v6.0(多线程网编).java");
//        	File destFile = new File("副本.java");
//        	
//        	FileUtils.copyFile(srcFile, destFile);
//        	
//        	File srcDir = new File("藏经阁");
//        	File destDir = new File("博学谷");
//		    FileUtils.copyDirectoryToDirectory(srcDir, destDir);//将整个源文件夹 复制到目标文件中
		    
		    
		    File srcDir = new File("藏经阁");
        	File destDir = new File("药王谷");
		    FileUtils.copyDirectory(srcDir, destDir);//将源文件夹中内容 复制到目标文件中
        }
}
