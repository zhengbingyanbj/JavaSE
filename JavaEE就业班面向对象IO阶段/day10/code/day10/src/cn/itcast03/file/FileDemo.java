package cn.itcast03.file;

import java.io.File;
import java.util.Date;

/*
 *   获取功能
 *      获取File对象对应的 名字
 *      String getName()
 *      String getAbsolutePath() 带盘符的路径
 *      long length()
 *      long lastModified()
 */
public class FileDemo {
  public static void main(String[] args) {
	  File file = new File("D:\\2017\\308\\day10\\aaa\\破天宝典v4.0.java");
      
	  //getName()
	  System.out.println("文件名称："+file.getName());
	  // getAbsolutePath()
	  System.out.println("获取文件绝对路径："+file.getAbsolutePath());
	  
	  //long length()获取文件占用的字节数  有效的占用的空间
	  System.out.println(file.length());
	  
	  // long lashModified() 获取最后修改时间的毫秒值
	  long time = file.lastModified();
      System.out.println(time);
      System.out.println(new Date(time));
  }
}
