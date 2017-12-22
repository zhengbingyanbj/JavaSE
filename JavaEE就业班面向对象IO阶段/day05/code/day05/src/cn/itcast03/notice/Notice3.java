package cn.itcast03.notice;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 
 *   子类重写父类方法时  
 *        声明的异常  必须是 父类方法中 声明异常的 子集
 *        
 *     如果父类上没有异常声明
 */
class Fu{
	
	public void show()throws IOException,ClassNotFoundException{}
	
	public void run(){}
}

class Zi extends Fu{
	
	public void show()throws ClassNotFoundException{}
	
	public void run() {
		
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Notice3 {

}
