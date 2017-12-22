package cn.itcast03.notice;

import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * 多异常处理
 * 
 *   1：多个异常分别处理
 *   2: 多个异常一次捕获多次处理
 *   3:多个异常一次捕获一次处理
 */

public class Notice2 {
//  public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
 public static void main(String[] args) {
	// 1：多个异常分别处理
	  try {
		show();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  try {
		show2();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  try {
		show3();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  //2：多个异常一次捕获多次处理
	  // 这种方式 中 大的异常 要写下面
	  
	  try{
		  show();
		  show2();
		  show3();
	  }catch(FileNotFoundException e){
		  e.printStackTrace();
	  }catch(IOException e){
		  e.printStackTrace();
	  }catch(ClassNotFoundException e){
		  e.printStackTrace();
	  }
	  
	 //3 多个异常一次捕获一次处理
	  try {
		  show();
		  show2();
		  show3();
	  } catch (Exception e) {
		 e.printStackTrace();
	  }
	  
	  
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
