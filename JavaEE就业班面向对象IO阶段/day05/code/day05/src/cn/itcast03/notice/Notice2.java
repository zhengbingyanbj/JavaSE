package cn.itcast03.notice;

import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * ���쳣����
 * 
 *   1������쳣�ֱ���
 *   2: ����쳣һ�β����δ���
 *   3:����쳣һ�β���һ�δ���
 */

public class Notice2 {
//  public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
 public static void main(String[] args) {
	// 1������쳣�ֱ���
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
	  
	  
	  //2������쳣һ�β����δ���
	  // ���ַ�ʽ �� ����쳣 Ҫд����
	  
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
	  
	 //3 ����쳣һ�β���һ�δ���
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
