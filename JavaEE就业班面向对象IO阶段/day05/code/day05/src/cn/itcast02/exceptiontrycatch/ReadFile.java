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

			throw new RuntimeException("读取有问题"+e);
		}
	} catch (FileNotFoundException e) {
		
		throw new RuntimeException("文件找不到"+e);
	}finally{
		
		if(fr!=null){
			try {
				fr.close();
			} catch (IOException e) {
				throw new RuntimeException("释放资源失败"+e);
			}
		}
	}
	  
	
	  
  }
}
