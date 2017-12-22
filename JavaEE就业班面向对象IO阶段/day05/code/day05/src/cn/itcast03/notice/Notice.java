package cn.itcast03.notice;

import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * 多异常处理
 * 
 *   声明
 *     多个异常 ,隔开  同时声明
 *     
 *     可以简化 
 *       在声明位置 抛出共同父类
 */

public class Notice {
//  public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
 public static void main(String[] args) throws Exception {
	  
	  show();
	  show2();
	  show3();
	  
  }
  
  public static void show () throws FileNotFoundException{
	  
	  if(1==1){
		  throw new FileNotFoundException();
	  }
  }
  
  
  public static void show2 () throws IOException{
	  
	  if(1==1){
		  throw new IOException();
	  }
  }
  
  public static void show3 () throws ClassNotFoundException{
	  
	  if(1==1){
		  throw new ClassNotFoundException();
	  }
  }
}
