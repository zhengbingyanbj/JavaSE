package cn.itcast02.exceptiontrycatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
  public static void main(String[] args)  {
	  
	
	 
	  FileReader fr = null;
	  
	  try {
		fr = new FileReader("a.txt");
		
		try {
			fr.read();
		} catch (IOException e) {

			throw new RuntimeException("��ȡ������"+e);
		}
	} catch (FileNotFoundException e) {
		
		throw new RuntimeException("�ļ��Ҳ���"+e);
	}finally{
		
		if(fr!=null){
			try {
				fr.close();
			} catch (IOException e) {
				throw new RuntimeException("�ͷ���Դʧ��"+e);
			}
		}
	}
	  
	
	  
  }
}
