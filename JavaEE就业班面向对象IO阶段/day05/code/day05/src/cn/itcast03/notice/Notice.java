package cn.itcast03.notice;

import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * ���쳣����
 * 
 *   ����
 *     ����쳣 ,����  ͬʱ����
 *     
 *     ���Լ� 
 *       ������λ�� �׳���ͬ����
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
